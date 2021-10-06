import java.io.*; 
import java.util.*;
import java.lang.*;

public class Patient{
    String name;
    Integer patient_period;
    String device_category;
    String device_name;
    List<Double> data_set = new ArrayList<Double>();
    List<Double> safe_range = new ArrayList<Double>();

    public void printPatient(){
        System.out.println("****************************");
        System.out.println("Name: "+ name);
        System.out.println("Period: "+ patient_period);
        System.out.println("Category: "+ device_category);
        System.out.println("Device: "+ device_name);
        System.out.println("Dataset: "+ data_set);
        System.out.println("Range: "+ safe_range);
        System.out.println("****************************\n");

    }
    
    public static Patient main(String pName, int pPeriod){
        Patient newP = new Patient();
        return newP;
    }
}