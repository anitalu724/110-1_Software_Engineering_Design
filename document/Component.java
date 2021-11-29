public abstract class Component{
    private int naturalSize;
    private int stretchablity;
    private int shrinkability;
    public Component(String iType, int iNaturalSize, int iStretchablity, int iShrinkability){
        this.type = iType;
        this.naturalSize = iNaturalSize;
        this.stretchablity = iStretchablity;
        this.shrinkability = iShrinkability;
    }
    public void print(){
        System.out.println("*-------------------*");
        System.out.println("The type is: "+this.type);
        System.out.println("The natural size is: "+this.naturalSize);
        System.out.println("The stretchablity is: "+this.stretchablity);
        System.out.println("The shrinkability is: "+this.shrinkability);
        System.out.println("");
    }

}

class Text extends Component{
    public Text(int iNaturalSize, int iStretchablity, int iShrinkability){
        super("Text", iNaturalSize, iStretchablity, iShrinkability);
    }
}

class GraphicalEmt extends Component{
    public GraphicalEmt(int iNaturalSize, int iStretchablity, int iShrinkability){
        super("Graph", iNaturalSize, iStretchablity, iShrinkability);
    }
}