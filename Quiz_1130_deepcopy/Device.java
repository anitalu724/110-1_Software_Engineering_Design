import java.util.*;

public class Device{
    private String category;
    private String name;
    private List<Float> factorDataset;
    private List<Integer> safeRanges;
    private Patient patient;
    public Device(String category, String name, int safeRangeLowerBound, int safeRangeUpperBound, Patient patient){
        if(  safeRangeLowerBound > safeRangeUpperBound | 
             (!category.equals("PulseSensor") & !category.equals("BloodPressureSensor") & !category.equals("TemperatureSensor") 
             )
          ){
            System.out.println("Input Error");
            return;
        }
        this.category = category;
        this.name = name;
        this.safeRanges = new ArrayList<>(Arrays.asList(safeRangeLowerBound, safeRangeUpperBound));
        this.patient = patient;

        
    }
    public void setFactorDataset(List<Float> factorDataset) { this.factorDataset = factorDataset; }

    public String getCategory() { return this.category; }
    public String getName() { return this.name; }
    public List<Float> getFactorDataset() { return this.factorDataset; }
    // public String getFactorDatasetFile() { return this.factorDatasetFile; }
    public List<Integer> getSafeRanges() { return this.safeRanges; }
    public Patient getPatient() { return this.patient; }


    public void printDevice(){
        System.out.println("\n*-----------------*");
        System.out.println("Device category: "+ this.getCategory());
        System.out.println("Device name: "+ this.getName());
        System.out.println("Device factorDataset: "+ this.getFactorDataset());
        System.out.println("SafeRanges: "+ this.getSafeRanges());
        System.out.println("Patient: "+ this.getPatient().getName());
        System.out.println("*-----------------*\n");
    }
}