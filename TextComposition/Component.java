public class Component{
    private int id;
    private int naturalSize;
    private int stretchablity;
    private int shrinkability;
    private String content;
    public Component(int iId, int iNaturalSize, int iStretchablity, int iShrinkability, String iContent){
        this.id = iId;
        this.naturalSize = iNaturalSize;
        this.stretchablity = iStretchablity;
        this.shrinkability = iShrinkability;
        this.content = iContent;
    }
    public void print(){
        System.out.print("["+this.getNaturalSize()+"]"+this.getContent());
    }
    // Getter and setter
    public int getId(){ return this.id; }
    public int getNaturalSize(){ return this.naturalSize; }
    public int getStretchablity(){ return this.stretchablity; }
    public int getShrinkability(){ return this.shrinkability; }
    public String getContent(){ return this.content; }
    
    public void setId(int id){ this.id = id; }
    public void setNaturalSize(int naturalSize){ this.naturalSize = naturalSize; }
    public void setStretchablity(int stretchablity){ this.stretchablity = stretchablity; }
    public void setShrinkability(int shrinkability){ this.shrinkability = shrinkability; }
    public void setContent(String content){ this.content = content; }
}

class Text extends Component{
    public Text(int iId, int iNaturalSize, int iStretchablity, int iShrinkability, String iContent){
        super(iId, iNaturalSize, iStretchablity, iShrinkability, iContent);
    }
}

class GraphicalEmt extends Component{
    public GraphicalEmt(int iId, int iNaturalSize, int iStretchablity, int iShrinkability, String iContent){
        super(iId, iNaturalSize, iStretchablity, iShrinkability, iContent);
    }
}