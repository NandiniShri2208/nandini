
    import java.io.*;
import java.util.*;
import java.util.Scanner;

    public class Solution {
        public static void main(String[] args) {
            int n;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            String arr[]=new String[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.next();
            }
            String o=arr[arr.length-1];
            for(int i=arr.length-1;i>=1;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=o;
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

