// A file is an ordinary file or a directory file. (Generalization)
public class File{
    String name = null;
    String type = "notDefine";
    public void print(){
        System.out.println(name+" "+type);
    }
    public void setName(String n){
        name = n;
    }
    public void setType(String t){
        type = t;
    }
    public static void main(String[] args){
        File file = new File();
        file.print();
        System.out.println("_________");
        file = (File) new OrdinaryFile();
        file.setName("file2");
        file.print();
        System.out.println("_________");
        file = new DirectoryFile();
        file.setName("file3");
        file.print(); 
    }

}




