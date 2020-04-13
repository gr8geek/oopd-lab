import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class TestFruit{
    public static void main(String args[])throws IOException{
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter taste and size of the Apple fruit");
        Apple apple =new Apple(in.readLine(),Double.parseDouble(in.readLine()));
        System.out.println("Enter taste and size of the Orange fruit");
        Orange orange=new Orange(in.readLine(),Double.parseDouble(in.readLine()));
        System.out.println("Apple's eat() invoked");
        apple.eat();
        System.out.println("Orange's eat() invoked");
        orange.eat();


    }

}