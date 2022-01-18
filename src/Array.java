import java.util.Scanner;

public class Array {
//int arr[];//instance variable
//public Array(){
//    arr=new int [5];
//}
     // declaration
//static int arr[];//class variable declaring size is illegal
//static {
//    arr=new int[5];  //creation
//}
    int arr[];
    Array(){
        arr=new int[10];
    }
    void removeDup(int [] arr){
        int start=0;
        int c=1;
        for(int i=1;i< arr.length;i++){
            if(arr[start] != arr[i]){
                ++start;
                arr[start]=arr[i];
                c++;
            }

        }
        for(int i=0;i<c;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
       Array obj=new Array();
//        for (int i: obj.arr) {
//            System.out.println(i);
//        }

        Scanner s=new Scanner(System.in);
        for(int i=0;i< obj.arr.length;i++){
            obj.arr[i]=s.nextInt();
        }
        obj.removeDup(obj.arr);
//        for(int res:arr){
//            System.out.println(res);
//        }
    }
}
