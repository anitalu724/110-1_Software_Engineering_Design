import java.lang.*;
import java.util.*;
public abstract class Chart {
    private ApplicationData applicationData;
    private String chartName;

    public Chart(String name, ApplicationData appData){
        this.chartName = name;
        this.applicationData = appData;
    }
    public String getChartName(){ return this.chartName; }
    public ApplicationData getApplicationData() { return this.applicationData; }

    public void display(){};
    public void change(String chartName, String key, int value){
        Set<String> keySet = getApplicationData().getData().keySet();
        if(keySet.contains(key)){
            getApplicationData().getData().put(key, value);
        }
        else{
            getApplicationData().addData(key, value);
        }
        System.out.println(chartName+" change "+key+" "+value+".");
    };
    public void update(){};
}





