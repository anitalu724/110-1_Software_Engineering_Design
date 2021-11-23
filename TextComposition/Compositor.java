import java.util.*;

public interface Compositor{
    public void compose(List<Component> components);
}

class SimpleCompositor implements Compositor{
    @Override 
    public void compose(List<Component> components){
        for(Component c : components){
            c.print();
            System.out.println("");
        }
    }
}

class TexCompositor implements Compositor{
    @Override 
    public void compose(List<Component> components){
        for (Component c : components){
            c.print();
            if(c.getContent().equals("<ParagraphEnd>")) System.out.print("\n");
            else System.out.print(" ");
        }

    }
}

class ArrayCompositor implements Compositor{
    @Override 
    public void compose(List<Component> components){
        for(int i = 0 ; i < components.size(); i++){
            if(i%3 != 2 && i != components.size()-1){
                components.get(i).print();
                System.out.print(" ");
            } 
            else if ((i%3 != 2 && i == components.size()-1) | i%3 == 2){
                components.get(i).print();
                System.out.print("\n");
            }
        }
    }
}
