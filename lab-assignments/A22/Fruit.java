
public class Fruit{
    String name,taste;
    double size;
    Fruit(String name,String taste,double size){
        this.name=name;
        this.size=size;
        this.taste=taste;
    }
    public void eat(){
        System.out.println("Name : "+name);
        System.out.println("Taste : "+taste);
       }
}
