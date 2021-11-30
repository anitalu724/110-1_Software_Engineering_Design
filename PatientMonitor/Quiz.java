import java.io.*;
import java.lang.*;
import java.util.*;

public class Quiz{
    public static void main(String[] args) throws IOException{
        Program program = new Program();
        File fakeDataFile = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(fakeDataFile));
        String line = "";
        while((line = reader.readLine())!= null && line.length()!=0){
            String[] cmd = line.split(" ");
            if(cmd.length == 1){
                if(Integer.parseInt(cmd[0]) > 0) program.setPeriod(Integer.parseInt(cmd[0]));
                else System.out.println("Input Error");
            } 
            else if (cmd.length == 3){
                program.addPatient(new Patient(cmd[1], Integer.parseInt(cmd[2])));
            }
            else if (cmd.length == 5){
                Patient p = program.getDatabase().get(program.getDatabaseSize() -1);
                
                // Device newDevice = new Device(cmd[0], cmd[1], Integer.parseInt(cmd[3]), Integer.parseInt(cmd[4]), p);
                Device newDevice = (cmd[0].equals("PulseSensor")) ? new PulseSensor(cmd[1], Integer.parseInt(cmd[3]), Integer.parseInt(cmd[4]), p) :
                                   (cmd[0].equals("BloodPressureSensor")) ?  new BloodPressureSensor(cmd[1], Integer.parseInt(cmd[3]), Integer.parseInt(cmd[4]), p) :
                                   (cmd[0].equals("TemperatureSensor")) ?  new TemperatureSensor(cmd[1], Integer.parseInt(cmd[3]), Integer.parseInt(cmd[4]), p) :
                                   null;
                if(newDevice == null){
                    System.out.println("Input Error");
                    break;
                } 
                
                File dataset = new File(cmd[2]);
                BufferedReader dataReader = new BufferedReader(new FileReader(dataset));
                String eachFactor = "";
                List<Float> tmpFactorDataset = new ArrayList<Float>();
                while((eachFactor = dataReader.readLine())!= null && eachFactor.length()!=0){
                    tmpFactorDataset.add(Float.parseFloat(eachFactor));
                }
                newDevice.setFactorDataset(tmpFactorDataset);
                p.addDevice(newDevice);
                // newDevice.printDevice();
            }
            else System.out.println("Input Error");
        }
        
        program.monitor();
        program.displayFactorDataset();
        
    }
}