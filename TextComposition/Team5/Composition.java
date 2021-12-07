import java.util.*;

public class Composition{
    private List<Component> components;
    private Compositor compositor;
    public Composition(){
        this.components = new ArrayList<Component>();
        this.compositor = null;
    }
    public void addComponent(Component newComponent){ this.components.add(newComponent); }
    public void changeSize(int cID, int newSize){
        for (Component c : components){
            if (c.getId() == cID){
                if (newSize < c.getShrinkability() | c.getStretchablity() < newSize){
                    System.out.println("component "+cID+" failed to change size");
                } 
                else {
                    c.setNaturalSize(newSize);
                    System.out.println("component "+cID+" size changed to "+ newSize);
                }
                return;
            } 
        }
        System.out.println("Component " + cID + " does not exist!");
    }
    public void setCompositor(Compositor c){ this.compositor = c; }
    public void arrange(){ this.compositor.compose(this.components); }

    public void printComponents(){
        System.out.println("\n*--------------------------*");
        System.out.println("The size of components is: "+ this.components.size());
        for (Component c : components){
            c.print();
        }
        System.out.println("*--------------------------*\n");
    }

}