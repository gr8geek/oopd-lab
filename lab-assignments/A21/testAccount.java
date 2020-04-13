import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
public class testAccount{
    public static void main(String args[])throws IOException
    {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Account> ac =new HashMap<String,Account>();
        System.out.println("Enter 1 or 2 to invoke either of two overloaded constructor to create a new account");
        System.out.println("Enter 3 to get account details");
        System.out.println("Enter any other number to exit");
        boolean loop=true;
        int ch,num;
        String name,t,add;
        double amt;
        while(loop){
            System.out.println("Enter your choice");
            ch=Integer.parseInt(in.readLine());
            switch(ch){
                case 1:
                System.out.println("Enter Name");
                name=in.readLine();
                System.out.println("Enter Ammount");
                amt=Double.parseDouble(in.readLine());
                System.out.println("Enter Account number");
                num=Integer.parseInt(in.readLine());
                Account a=new Account(name,num,amt);
                ac.put(name,a);
                break;
                case 2:
                System.out.println("Enter Name");
                name=in.readLine();
                System.out.println("Enter Ammount");
                amt=Double.parseDouble(in.readLine());
                System.out.println("Enter Account number");
                num=Integer.parseInt(in.readLine());
                System.out.println("Enter account type");
                t=in.readLine();
                System.out.println("Enter address");
                add=in.readLine();
                Account x=new Account(name,num,add,t,amt);
                ac.put(name,x);
                break;
                case 3:
                System.out.println("Enter name of Account holder");
                name=in.readLine();
                Account x2=ac.get(name);
                x2.display();
                break;
                default:
                loop=false;
                break;
            }


        }
    }
}