public class Student{
    private int roll;
    private String name;
    public Student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    public static void main(String args[])
    {
        Student st=new Student(2,"gaurav");
        Record rec=new Record();
        rec.Total();
        System.out.println("Changes in dev branch to push over github");
        System.out.println("Changes in Master branch to push over github");
    }
}