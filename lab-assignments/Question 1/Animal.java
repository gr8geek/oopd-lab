public class Animal{
    String name;
    String sleep_state;
    String food;
    Animal(String name,String food){
        this.name=name;
        this.food=food;
        this.sleep_state="";
    }
    public void eat(String food){
        System.out.println("Animal named "+name+" eats "+food);
        this.food=food;
    }
    public void sleep(int s){
        if(s==0){
            System.out.println("Animal "+name+" is set to sleeping state\nzzZ");
            sleep_state="Sleeping ..zzZ";
        }
        if(s==1){
            System.out.println("Animal "+name+" is awake");
            sleep_state="Awake  ";
        }
    }
    public void getState(){
        System.out.println("Name:"+name);
        System.out.println("Sleeping state:"+sleep_state);
        System.out.println("Food eats :"+food);
    }

}