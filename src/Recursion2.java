import java.util.Scanner;

public class Recursion2 {
   public static  String replace(String str,char ch1,char ch2,String temp){
        if(str.length() == 0){
            return temp;
        }
        char ch=str.charAt(0);
        if(ch1 == ch){
            temp+=ch2;
        }
        else {
            temp+=ch;
        }
        String res=replace(str.substring(1),ch1,ch2,temp);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //String str=sc.nextLine();
        System.out.println(replace("i am nandini",'i','k',""));

    }
}
