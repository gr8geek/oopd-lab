public class Student{
    String name;
    char gender;
    int age;
    Student(String name,char gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;

    }
    public void getStudent(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Gender : "+gender);

    }
}
