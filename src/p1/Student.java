package p1;

import java.util.*;

public class Student {
    private int rollno;
    private int marks;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String toString() {
        return this.rollno + " " + this.name +
                " " + this.marks;
    }
}
class sortByMarks implements Comparator<Student> {
public int compare(Student  a,Student b){
    return  a.getMarks()+b.getMarks();
}
    public static void main(String[] args) {
        Student obj1 = new Student();
      Student arr[] = new Student[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i].setMarks(s.nextInt());
            arr[i].setRollno(s.nextInt());
            arr[i].setName(s.next());
        }
//        ArrayList<Student> arr=new ArrayList<Student >();
//        for (int i = 0; i < arr.size(); i++) {
//
//        }
//        Collections.sort(arr,);

    }
}


