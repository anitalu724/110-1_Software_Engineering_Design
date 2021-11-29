public class Document{
    private String type;
    public Document(String nType){
        this.type = nType;
    }
    public String getType(){ return this.type; }
}

class DrawingDocument extends Document{
    public DrawingDocument(){
        super("DrawingDocument");
    }
}

class TextDocument extends Document{
    public TextDocument(){
        super("TextDocument");
    }
}