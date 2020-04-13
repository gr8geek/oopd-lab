 
import java.util.Scanner;
import java.util.HashMap;
public class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String t;
        HashMap<String,Teacher> tmap=new HashMap<String,Teacher>();
        HashMap<String,CollegeStudent> smap=new HashMap<String,CollegeStudent>();
        System.out.println("\n1.Add new Teacher\n2.Add new Student\n3.Display Teacher\n4.Dispaly Student");
        boolean loop=true;
        while(loop){
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter the name");
                t=sc.next();
                if(tmap.containsKey(t)){
                    System.out.println("Teacher exists");
                }
                else{
                    System.out.println("Enter gender age and salary in seperate lines");
                    char gen=sc.next().charAt(0);
                    int age=sc.nextInt();
                    double sal=sc.nextDouble();
                    Teacher tem=new Teacher(t,gen,age,sal);
                    
                    tmap.put(t,tem);
                    tem.setSubjects(sc);
                }
                break;
                case 2:
                System.out.println("Enter the name");
                t=sc.next();
                if(smap.containsKey(t)){
                    System.out.println("Student exists");
                }
                else{
                    System.out.println("Enter gender age major and semester number in seperate lines");
                    smap.put(t, new CollegeStudent(t, sc.next().charAt(0),sc.nextInt(),sc.next(),sc.nextInt()));
                }
                break;
                case 3:
                System.out.println("Enter the name");
                t=sc.next();
                if(!tmap.containsKey(t)){
                    System.out.println("Teacher does not exists");
                }
                else{
                    Teacher tem=tmap.get(t);
                    tem.getTeacher();
                }
                break;
                case 4:
                System.out.println("Enter the name");
                t=sc.next();
                if(!smap.containsKey(t)){
                    System.out.println("Student Does not exists");
                }
                else{
                    CollegeStudent tmp=smap.get(t);
                    tmp.getStudent();

                }
                break;
                default:
                loop=false;
                break;
            }
        }
        sc.close();

    }
}

