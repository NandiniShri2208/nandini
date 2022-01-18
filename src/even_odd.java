import java.util.ArrayList;
import java.util.Scanner;

public class even_odd {
    int m,n;
    int [][]arr;
    even_odd(int m,int n) {
        this.m = m;
        this.n = n;
        arr = new int[m][n];
    }
    public static void main(String[] args) {
        ArrayList<Integer>a1=new ArrayList<Integer>();
        ArrayList<Integer>a2=new ArrayList<Integer>();
        even_odd obj=new even_odd(3,3);
        Scanner s=new Scanner(System.in);
        for(int i=0;i< obj.m;i++){
            for(int j=0;j< obj.n;j++){
                obj.arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i< obj.m;i++){
            for(int j=0;j< obj.n;j++) {
                if(obj.arr[i][j] % 2 == 0){
                    a1.add(obj.arr[i][j]);
                }else{
                    a2.add(obj.arr[i][j]);
                }

            }
            }
        System.out.println(a1);
        System.out.println(a2);


    }
}
