 
public class CollegeStudent extends Student{
    String major;
    int semester;
    CollegeStudent(String name,char gender,int age,String major,int semester){
        super(name,gender,age);
        this.major=major;
        this.semester=semester;
    }
    
    @Override
    public void getStudent(){
        super.getStudent();
        System.out.println("Major : "+major);
        System.out.println("Semester : "+semester);
    }
}

