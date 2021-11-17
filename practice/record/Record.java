import java.util.*;
import java.text.*;

public class Record{
    String date;   // yyyy/MM/dd HH:mm:s
    String content;

    public Record(String newContent){
        Date nowDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        date = formatter.format(nowDate);
        content = newContent;
    }
    public void printRecord(){
        System.out.println("Date: "+date);
        System.out.println("Content: "+ content);
    }

}