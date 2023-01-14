import java.util.Scanner;
public class Student { //class creation and field variable declaration
    int id;
    static double salary;
    final double pie=3.14; //final variable
    String name;
//method overloading
    void thisYear(double year, int month) {
        System.out.println("This is first example of method overloading");
    }
    void thisYear(int year,int month){
        System.out.println("This is second example of method overloading");
    }
    //static and final method
    static final void unchangedMethod(){
        System.out.println("The values inside this method can't be changed but can be used throughout the class ");
        //object referencing
        String s;
        s = "A statement inside string s";
        String t;
        t=s; //now, they both refer to the same string
}

Student(int id, String name){
        this.name=name; //using this for parameter name same as field variable
        this.id=id;
    }
    static double salary(double gs,double pf,double pt,double it)
    {
        pf=pf*(gs/100);
        it=it*(gs/100);
        pt=pt*(gs/100);
        double n=gs-it-pt-pf;
        return n;
    }
    }
    public String getName(){
        return name;
    }
    public void setName(String Grade){
    this.name=name;
}
}
// Using this with a Constructor
class Rectangle{
    int x,y,height,width;
    public Rectangle() {
        this(0, 0, 1, 1);
    }
    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

}

    class main {
        public static void main(String[] args) {
            Student studentInfo = new Student(2123, "John");

            studentInfo.setName("Hermon");
            System.out.println("The student's name is" + studentInfo.getName());
            double gs,it,pt,pf,netSalary;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Gross salary");
            gs=sc.nextDouble();
            System.out.println("Enter Income Tax %");
            it=sc.nextDouble();
            System.out.println("Enter Professional Tax %");
            pt=sc.nextDouble();
            System.out.println("enter Provident Fund %");
            pf=sc.nextDouble();
            netSalary=salary(gs,pf,pt,it);
            System.out.println("Net Salary is="+netSalary);
        }
    }