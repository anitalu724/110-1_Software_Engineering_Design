import java.lang.*;
import java.util.*;

public class ApplicationData {
    private List<Chart> charts;
    private LinkedHashMap<String, Integer> data;

    public ApplicationData(){
        this.charts = new ArrayList<Chart>();
        this.data = new LinkedHashMap<String, Integer>();
    }

    public void addData(String item, int value){
        this.data.put(item, value);
    }
    public LinkedHashMap<String, Integer> getData() { return this.data; }
    public List<Chart> getCharts() { return this.charts; }
    public void change(){ for(Chart c : getCharts()) c.update(); }
    public void attach(Chart newChart){
        this.charts.add(newChart);
    }
}