import java.io.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Composition composition = new Composition();
        File file = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = "";
        while((line = reader.readLine()) != null && line.length() != 0){
            String[] cmd = line.split(" ");
            if(cmd[0].equals("Text")){
                composition.addComponent(new Text(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]), Integer.parseInt(cmd[3]), Integer.parseInt(cmd[4]), cmd[5]));
            }
            else if(cmd[0].equals("GraphicalElement")){
                composition.addComponent(new GraphicalEmt(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]), Integer.parseInt(cmd[3]), Integer.parseInt(cmd[4]), cmd[5]));
            }
            else if (cmd[0].equals("ChangeSize")){
                composition.changeSize(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]));
            }
            else if (cmd[0].equals("Require")){
                if(cmd[1].equals("SimpleComposition")){
                    composition.setCompositor(new SimpleCompositor());
                    composition.arrange();
                }
                else if(cmd[1].equals("TexComposition")){
                    composition.setCompositor(new TexCompositor());
                    composition.arrange();
                }
                else if(cmd[1].equals("ArrayComposition")){
                    composition.setCompositor(new ArrayCompositor());
                    composition.arrange();
                }
            }
            else{
                System.out.println("Error");
            }
        }
    }
}