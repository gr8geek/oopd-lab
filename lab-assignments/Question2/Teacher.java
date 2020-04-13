import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Teacher extends Person{
    ArrayList<String> subjects=new ArrayList<String>();
    double sal;//salary
    Teacher(String name,char gender,int age,double sal){
        super(name,gender,age);
        this.sal=sal;
    }
    public void setSubjects(Scanner sc){
        String cont="";
        System.out.println("Enter the lists of subjects\nType Exit to finish");
        cont=sc.nextLine();
        while(!cont.equalsIgnoreCase("Exit")){
            subjects.add(cont);
            cont=sc.nextLine();
        }
    }
    public void getTeacher(){
        getPerson();
        System.out.println("Salary : "+sal);
        Iterator<String> it=subjects.listIterator();
        System.out.println("List of Subjects:");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
