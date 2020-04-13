public class Account{
    String name;
    int num;
    double amount;
    String address;
    String type;
    int con;
    Account(String name,int num,double amount){
        this.name=name;
        this.num=num;
        this.amount=amount;
        con=1;
    }
    Account(String name,int num,String address,String type,double balance){
        this.name=name;
        this.num=num;
        this.address=address;
        this.type=type;
        this.amount=balance;
        con=2;
    }
    public void display(){
        System.out.println("Name ="+name);
        System.out.println("Account Number="+num);
        System.out.println("Ammount/Balance ="+amount);
        if(con==2){
            System.out.println("Address = "+address);
            System.out.println("Account Type ="+type);

        }

        
    }
}