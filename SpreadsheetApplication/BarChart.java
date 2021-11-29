import java.lang.*;
import java.util.*;
public class BarChart extends Chart{
    public BarChart(ApplicationData appData){
        super("BarChart", appData);
    }
    
    @Override
    public void display(){
        LinkedHashMap<String, Integer> data = getApplicationData().getData();
        for(String key : data.keySet()){
            for(int i = 0; i < data.get(key); i++) System.out.print("=");
            System.out.println(" "+key);
        }
    }

    @Override
    public void update(){
        this.display();
    }
}