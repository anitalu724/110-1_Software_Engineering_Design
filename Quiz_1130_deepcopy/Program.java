import java.util.*;

public class Program{
    private int period;
    private List<Patient> database;
    private List<String> alarmMessages;
    public Program(){
        this.database = new ArrayList<Patient>();
        this.alarmMessages = new ArrayList<String>();
    }

    public void setPeriod( int period )         { this.period = period; }
    public int  getPeriod()                     { return this.period; }
    public void addPatient( Patient patient )   { 
        for(Patient p : database){
            if(p.getName().equals(patient.getName())){
                System.out.println("Input Error");
                return;
            }
        }
        if(patient.getPeriod() <= 0){
            System.out.println("Input Error");
            return;
        }
        this.database.add(patient); 
    }
    public List<String> getAlarmMessages()       { return this.alarmMessages; }
    public int getDatabaseSize()                { return this.database.size(); }
    public List<Patient> getDatabase()          { return this.database; }
    public Patient getLastPatient()             { return this.getDatabase().get(this.getDatabaseSize() -1); }


    public void monitor(){
        for(int i = 0; i <= getPeriod(); i++){
            for(Patient p : getDatabase()){
                if(i % p.getPeriod() == 0){
                    int idx = i / p.getPeriod();
                    for(Device d : p.getDevices()){
                        if(idx < d.getFactorDataset().size()){
                            if (d.getFactorDataset().get(idx) != -1) {
                                if (d.getFactorDataset().get(idx) > d.getSafeRanges().get(1) | d.getFactorDataset().get(idx) < d.getSafeRanges().get(0) )
                                    getAlarmMessages().add("["+i+"] "+p.getName()+" is in danger! Cause: "+d.getName()+" "+String.format("%.1f", d.getFactorDataset().get(idx)));
                            }
                            else getAlarmMessages().add("["+i+"] "+d.getName()+" falls");
                            
                        } 
                        else getAlarmMessages().add("["+i+"] "+d.getName()+" falls");
                    }

                    
                }
            }
        }
        for(String message : getAlarmMessages()) System.out.println(message);
    }

    public void displayFactorDataset(){
        for(Patient p : this.getDatabase()){
            System.out.println("patient "+p.getName());
            for(Device d : p.getDevices()){
                System.out.println(d.getCategory()+" "+d.getName());
                for(int i = 0; i <= getPeriod(); i++){
                    if(i % p.getPeriod() == 0){
                        int idx = i / p.getPeriod();
                        if(idx < d.getFactorDataset().size()){
                            System.out.println("["+i+"] "+String.format("%.1f", d.getFactorDataset().get(idx)));
                        }
                        else System.out.println("["+i+"] -1.0");
                    }
                }
            }
        }
        
    }

    
    // public void printProgram(){
    //     System.out.println("\n==================");
    //     System.out.println("Period: "+this.getPeriod());
    //     System.out.println("Database size: "+this.getDatabaseSize());
    //     System.out.println("==================\n");
    // }
    
}