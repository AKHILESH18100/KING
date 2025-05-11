public class statickey{
public static void main(String[] args) {
    School s1= new School();
    School s2= new School();
    School s3= new School();
    s2.name="RSS";
    s3.name="BRS";
    s3.setname();
    s2.setname();

    
}
}
class School{
    System.out.println("Hello");
       String name;
    void setname(){
        System.out.println(this.name);
    } 
    void getname(){
        System.out.println();
    }
}