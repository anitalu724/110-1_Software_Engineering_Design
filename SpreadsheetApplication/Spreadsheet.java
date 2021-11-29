import java.lang.*;
import java.util.*;
public class Spreadsheet extends Chart{
    public Spreadsheet(ApplicationData appData){
        super("Spreadsheet", appData);
    }
    
    
    @Override
    public void display(){
        LinkedHashMap<String, Integer> data = getApplicationData().getData();
        for(String key : data.keySet()){
            System.out.println(key+ " " + data.get(key));
        }

    }
    // @Override
    // public void change(String key, int value){

    // }
    @Override
    public void update(){
        this.display();
    }
}