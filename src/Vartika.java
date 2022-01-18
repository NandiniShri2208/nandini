public class Vartika {
    int rollNo;
    String name;
    Vartika(){
        rollNo=10;
        name="nandini";
    }
    Vartika(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
    public  void show(){
        System.out.println(rollNo);
        System.out.println(name);
    }
};
 class VartikaTest{
    public static void main(String[] args) {
        Vartika obj1=new Vartika();
        Vartika obj2=new Vartika(12,"khushi");
        obj1.show();
        obj2.show();
    }
}
