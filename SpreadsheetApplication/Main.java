import java.io.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) throws IOException{
        ApplicationData applicationData = new ApplicationData();
        File file = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = "";
        while((line = reader.readLine()) != null && line.length() != 0){
            String[] cmd = line.split(" ");
            if(cmd[0].equals("data")){
                applicationData.addData(cmd[1], Integer.parseInt(cmd[2]));
            }
            else if (cmd[0].equals("attach")){
                if (cmd[1].equals("Spreadsheet")){
                    applicationData.attach( new Spreadsheet(applicationData));
                }
                else if (cmd[1].equals("BarChart")){
                    applicationData.attach( new BarChart(applicationData));
                }
                else if (cmd[1].equals("PieChart")){
                    applicationData.attach( new PieChart(applicationData));
                }
            }
            else if (cmd[0].equals("change")){
                for(Chart c : applicationData.getCharts()){
                    if (c.getChartName().equals(cmd[1])){
                        c.change(cmd[1], cmd[2], Integer.parseInt(cmd[3]));
                    }
                }
                for(Chart c : applicationData.getCharts()){ c.update(); }
            }
        }
    }
}