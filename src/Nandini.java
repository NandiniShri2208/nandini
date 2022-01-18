import java.util.Scanner;
public class Nandini {
    int id;
    String name;
    String c_name;
    int sal;
    public Nandini (String c_name,String name,int id,int sal ){
        this.id=id;
        this.name=name;
        this.c_name=c_name;
        this.sal=sal;
    }
    public static void result(Nandini tarr[]){
        int maxsal1=Integer.MIN_VALUE,maxsal2=Integer.MIN_VALUE;
        int Aindex=0,Bindex=0;
        for(int i=0;i< tarr.length;i++){
            if(tarr[i].c_name.equals("A") && tarr[i].sal>maxsal1){
                maxsal1=tarr[i].sal;
                Aindex=i;
            }
            if(tarr[i].c_name.equals("B") && tarr[i].sal>maxsal2){
                maxsal2=tarr[i].sal;
                Bindex=i;
            }

        }
        System.out.println("The employee name is" + tarr[Bindex].name +"sal="+tarr[Bindex].sal+"company name"+tarr[Bindex].c_name);
        System.out.println("the employee name is"+tarr[Aindex].name+"sal="+tarr[Aindex].sal+"company name"+tarr[Aindex].c_name);

    }
}
class NandiniTest{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("how many objects u want to create");
        int size=s.nextInt();
        //Employee
    }
}