import java.lang.*;
import java.text.*;
import java.util.*;
public class PieChart extends Chart{
    public PieChart(ApplicationData appData){
        super("PieChart", appData);
    }
    
    @Override
    public void display(){
        LinkedHashMap<String, Integer> data = getApplicationData().getData();
        float sum = 0.0f;
        for (float f : data.values()) sum += f;
        for(String key : data.keySet()){
            float tmp = data.get(key)/sum*100;
            DecimalFormat df = new DecimalFormat("#.0");
            System.out.println(key+" "+df.format(tmp)+"%");
        }
    }
    @Override
    public void update(){
        this.display();
    }
}