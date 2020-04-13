import java.util.Scanner;
import java.util.HashMap;
public class Test{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String t,food;
        System.out.println("Welcome to animal test ");
        System.out.println(" Options: \n1.Create Animal\n2.Create Bird\n3.Display Animal\n4.Display Bird\n5.Modify State of Animal\n6.Modify State of Bird\n Press Any othe key to EXIT");
        boolean loop=true;
        HashMap<String,Animal> ani=new HashMap<String,Animal>();
        HashMap<String,Bird> brd =new HashMap<String,Bird>();
        while(loop){
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter Name of Animal");
                t=sc.next();                
                if(ani.containsKey(t)){
                    System.out.println("Animal already exists");
                }
                else{
                    System.out.println("Food of Animal");
                    food=sc.next();
                    ani.put(t,new Animal(t,food));
                }
                break;
                case 2:
                System.out.println("Enter Name of Bird");
                t=sc.next();
                if(ani.containsKey(t)){
                    System.out.println("Bird already exists");
                }
                else{
                    System.out.println("Food of Bird");
                    food=sc.next();
                    brd.put(t,new Bird(t,food));
                }
                break;
                case 3:
                System.out.println("Enter Name of Animal");
                t=sc.next();
                if(ani.containsKey(t)){
                    Animal temp=ani.get(t);
                    temp.getState();    
                }
                else{
                    System.out.println("Animal does not exists");
                }
                break;
                case 4:
                System.out.println("Enter Name of Bird");
                t=sc.next();
                if(brd.containsKey(t)){
                    Bird temp=brd.get(t);
                    temp.getState();    
                }
                else{
                    System.out.println("Bird does not exists");
                }
                break;
                case 5:
                System.out.println("Enter Name of Animal");
                t=sc.next();
                if(ani.containsKey(t)){
                    Animal temp=ani.get(t);
                    System.out.println("Enter the sleeping state(0=sleeping 1=awake)");
                    int x=sc.nextInt();
                    temp.sleep(x);

                }
                else{
                    System.out.println("Animal does not exists");
                }
                break;
                case 6:
                System.out.println("Enter Name of Bird");
                t=sc.next();
                if(brd.containsKey(t)){
                    Bird temp=brd.get(t);
                    System.out.println("Enter the sleeping state(0=sleeping 1=awake)");
                    int x=sc.nextInt();
                    temp.sleep(x);
                    System.out.println("Enter the flying state(0=fly 1=not flying)");
                    x=sc.nextInt();
                    temp.fly(x);       
                }
                else{
                    System.out.println("Bird does not exists");
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