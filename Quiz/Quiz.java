import java.io.*; 
import java.util.*;
import java.lang.*;

public class Quiz{
    int monitor_period;
    List<Patient> patients = new ArrayList<Patient>();
    
    public static void main(String[] args) throws IOException{
        Quiz quiz = new Quiz();
        File fakeDataFile = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(fakeDataFile));
        String line = "";
        while((line = reader.readLine())!= null && line.length()!=0){
            String[] elements = line.split(" ");
            if(elements.length == 1){
                quiz.monitor_period = Integer.valueOf(elements[0]);
                if(quiz.monitor_period <= 0){
                    System.out.println("Input Error"); 
                    
                }
            }
            else if(elements.length == 3){
                if(!elements[0].equals("patient") | Integer.valueOf(elements[2]) < 0){ System.out.println("Input Error"); }
                else{
                    boolean repeat = false;
                    for(int i = 0; i < quiz.patients.size(); i++){
                        if(elements[1].equals(quiz.patients.get(i).name)){ System.out.println("Input Error"); repeat = true;}
                    }
                    if(!repeat){
                        Patient newPatient = new Patient();
                        newPatient.name = elements[1];
                        newPatient.patient_period = Integer.valueOf(elements[2]);
                        quiz.patients.add(newPatient);
                    }
                }
            }
            else if (elements.length == 5){
                if(!elements[0].equals("PulseSensor") & !elements[0].equals("BloodPressureSensor") & !elements[0].equals("TemperatureSensor")){ System.out.println("Input Error"); }
                else{
                    if(Integer.valueOf(elements[3]) < 0 | Integer.valueOf(elements[4]) < 0){ System.out.println("Input Error"); }
                    else if (quiz.patients.get(quiz.patients.size()-1).device_category != null 
                             ){
                                System.out.println("Input Error"); 
                    }
                    else{
                        int index = quiz.patients.size()-1;
                        quiz.patients.get(index).device_category = elements[0];
                        quiz.patients.get(index).device_name = elements[1];
                        quiz.patients.get(index).safe_range.add(Double.valueOf(elements[3]));
                        quiz.patients.get(index).safe_range.add(Double.valueOf(elements[4]));

                        File dataset = new File(elements[2]);
                        BufferedReader dataReader = new BufferedReader(new FileReader(dataset));
                        String eachData = "";
                        while((eachData = dataReader.readLine())!= null && eachData.length()!=0){
                            quiz.patients.get(index).data_set.add(Double.valueOf(eachData));
                        }
                    }
                }
            }
            else{
                System.out.println("Input Error");
            }
        }

        for(int i = 1; i <= quiz.monitor_period; i++){
            for(int p = 0; p < quiz.patients.size(); p++){
                if(i%quiz.patients.get(p).patient_period == 0){
                    // System.out.print("["+i+"] ");
                    int num = i/quiz.patients.get(p).patient_period;
                    if(num < quiz.patients.get(p).data_set.size()){
                        Double status = quiz.patients.get(p).data_set.get(num);
                        if(status == -1){
                            System.out.println("["+i+"] "+quiz.patients.get(p).device_name+ " falls");
                        }
                        else if(status < quiz.patients.get(p).safe_range.get(0) | status > quiz.patients.get(p).safe_range.get(1)){
                            System.out.println("["+i+"] "+quiz.patients.get(p).name + " is in danger! Cause: " + quiz.patients.get(p).device_name + " " + status);
                        }

                    }
                    else{
                        System.out.println("["+i+"] "+quiz.patients.get(p).device_name+ " falls");
                    }
                    
                }
            }
        }

        for(int p = 0; p < quiz.patients.size(); p++){
            System.out.println("patient "+quiz.patients.get(p).name);
            System.out.println(quiz.patients.get(p).device_category+" "+quiz.patients.get(p).device_name);
            for(int i = 0; i <= quiz.monitor_period; i++){
                if(i%quiz.patients.get(p).patient_period == 0){
                    System.out.print("["+i+"] ");
                    int num = i/quiz.patients.get(p).patient_period;
                    if(num < quiz.patients.get(p).data_set.size()){
                        Double status = quiz.patients.get(p).data_set.get(num);
                        System.out.println(status);
                    }
                    else{
                        System.out.println(-1.0);
                    }
                }
            }

        }



        // System.out.println("\n***");
        // for(int i = 0; i < quiz.patients.size(); i++){
        //     quiz.patients.get(i).printPatient();
        // }
        
    }
}