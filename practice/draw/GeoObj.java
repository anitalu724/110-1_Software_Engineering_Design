public class GeoObj extends DrawingObj{
    public void print(){
        System.out.println("Type: "+type);
    }
    public Text(String newContent){
        setType("GeoObj");
        content = newContent;
    }
}