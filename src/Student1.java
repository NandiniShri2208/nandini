import java.util.Scanner;

public class Student1{
    public int rollno;
    public String name;
//    public void setValue(){
//        rollno=10;
//        name="neeraj";
//    }
    public void setValue(){
        Scanner s=new Scanner(System.in);
        rollno=s.nextInt();
        s.nextLine();
        name=s.nextLine();
    }
    public void printvalue(){
        System.out.println(rollno +"\t"+name);
    }
}
class Student1Main{
    public static void main(String[] args) {
        Student1 obj=new Student1();//object creation
//        obj.setValue();//. operator is member access operator.
//        obj.rollno=10;
//        obj.name="nandini";
        obj.setValue();
        obj.printvalue();
        Student1 obj2=new Student1();
//        obj2.rollno=12;
        obj2.setValue();
//        obj2.name="vartika";
//        obj2.setValue();
        obj2.printvalue();

    }
}
