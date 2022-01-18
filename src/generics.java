import java.util.ArrayList;
import java.util.Scanner;
class myGeneric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public myGeneric(int val,T1 t1,T2 t2) {
        this.val=val;
        this.t1 = t1;
        this.t2= t2;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
public class generics {
    public static void main(String[] args) {
        ArrayList <String>arrayList=new ArrayList();
        arrayList.add("nandini");
        arrayList.add("khu");
        arrayList.add("yy");
        arrayList.add(String.valueOf(1));
        String a=arrayList.get(3);
       // System.out.println(a);
        myGeneric<String,Integer>g1=new myGeneric(23,"my name is nandini",23);
       String s= g1.getT1();
       int i= g1.getT2();
        System.out.println(s + i + g1.getVal());
    }
}
