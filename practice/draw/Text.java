public class Text extends DrawingObj{
    String content;
    public void print(){
        System.out.println("Type: "+type);
        System.out.println("Content: "+content);
    }
    public Text(String newContent){
        setType("Text");
        content = newContent;
    }
}