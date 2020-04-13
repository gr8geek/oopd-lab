public class Bird extends Animal{
    String fly_state;
    Bird(String name,String food){
        super(name,food);
    }
    @Override
    public void eat(String food){
        System.out.println("Bird named "+name+" eats "+food);
        this.food=food;
    }
    @Override
    public void sleep(int s){
        if(s==0){
            System.out.println("Bird "+name+" is set to sleeping state\nzzZ");
            sleep_state="Sleeping ..zzZ";
        }
        if(s==1){
            System.out.println("Bird "+name+" is awake");
            sleep_state="Awake  ";
        }
    }
    public void fly(int s){
        if(s==0){
            System.out.println("Bird "+name+" is set to flying state");
            fly_state="Flying";
        }
        if(s==1){
            System.out.println("Bird "+name+" is set to non flying state");
            fly_state="Not flying ";
        }
    }
    public void getState(){
        super.getState();
        System.out.println("Flying state :"+fly_state);
    }

}