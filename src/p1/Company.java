package p1;

import java.util.Scanner;

public class Company {
    int products[];
    Company(){
        products=new int [3];
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Company c=new Company();
Company salesman[];
salesman=new Company[5];
for(int i=0;i<salesman.length;i++){
    for(int j=0;j<3;j++){
       salesman[i].products[j]=s.nextInt();
    }
}
        for(int i=0;i<salesman.length;i++){
            for(int j=0;j<3;j++){
                System.out.println(salesman[i].products[j]);
            }
        }
    }
}
