// class Test {//outer class
//    class Demo1{   //inner class
//
//    }
//}
//we cannot use,private,protectd in outer class.
//we cannot use  more than one public modifier in one class.
//we name our file with that name of class that has public modifier.
//import java.lang.*;   //lang package
public class Test {
    public static void main(String[] args) {    //JVM configures this prototype for starting the program execution
        System.out.println(args[0]);
        System.out.println(args[1]);
//        int a=Integer.parseInt(args[0]);//converts string into int primitive type
//        int b=Integer.parseInt(args[1]);
        System.out.println(args[0]+args[1]);
      //prints 30
        //if 10 20 is given ,treated as string ,so concatentes 1020;
        //exception occurs on using args[1] and args[0]
    }
}
//no need to declare objects--> using static keyword
//string[] args is a class.
//creating arr in java
// in java arrays are consideres as reference.
// int

