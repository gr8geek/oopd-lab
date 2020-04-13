public class Person{
    String name;
    char gender;
    int age;
    Person(String name,char gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;

    }
    public void getPerson(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Gender : "+gender);

    }
}