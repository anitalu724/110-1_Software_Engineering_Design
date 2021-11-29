import java.io.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) throws IOException{
        PowerfulApplication pApp = new PowerfulApplication();
        File file = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = "";
        while((line = reader.readLine()) != null && line.length() != 0){
            if(line.equals("Present")) pApp.present();
            else if (line.equals("Draw")) pApp.create(new DrawingDocument());
            else if (line.equals("Text")) pApp.create(new TextDocument());
            else {}
        }
    }
}