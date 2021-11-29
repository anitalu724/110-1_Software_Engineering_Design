import java.util.*;

public class PowerfulApplication{
    private List<Document> documents;
    public PowerfulApplication(){
        this.documents = new ArrayList<Document>();
    }
    public void present(){
        for(Document d : this.documents){
            System.out.println(d.getType());
        }
    }

    public void create(Document nDoc){
        this.documents.add(nDoc);
    }

    public void manage(){
        System.out.println("==================\n");
        System.out.println("List size: "+ this.documents.size());
        System.out.println("\n==================");
    }
}
