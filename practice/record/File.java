import java.util.*;

public class File{
    List<Record> recordList = new ArrayList<Record>();
    public void addRecord(Record newRecord){
        recordList.add(newRecord);
    }
    public void printRecordNum(){
        System.out.println("The size of recordList: "+recordList.size());
    }
    public void printRecordList(){
        for(int i = 0; i < recordList.size(); i++){
            System.out.println("# "+i);
            recordList.get(i).printRecord();
        }
    }
    public static void main(String[] args){
        File file = new File();
        Record newRecord_a = new Record("a");
        file.addRecord(newRecord_a);
        Record newRecord_b = new Record("b");
        file.addRecord(newRecord_b);
        Record newRecord_c = new Record("c");
        file.addRecord(newRecord_c);

        file.printRecordList();
    }
}