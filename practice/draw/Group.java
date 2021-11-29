public class Group extends DrawingObj{
    List<DrawingObj> groupMembers;
    public void printMemNum(){
        System.out.println("This group has "+groupMembers.size()+ " members.")
    }
}
