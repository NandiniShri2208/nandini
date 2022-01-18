package Nandini;

public class Emp {
    int emp_id;
    Name  name;
    Address address;
    float salary;
    String destination;
    Emp(int emp_id,Name  name,Address address,float salary,String destination){
        this.emp_id=emp_id;
        this.name=name;
        this.address=address;
        this.destination = destination;
        this.salary=salary;
    }
    void display(){
        System.out.println(emp_id+" "+name.first_name+ " "+name.last_name);
        System.out.println(address.city+" "+address.state+" "+address.area);
        System.out.println(salary+ " "+destination);
    }

    public static void main(String[] args) {
        Name name1=new Name("nandini","shrivastav");
        Name name2=new Name("khushi","shrivastav");
        Address address1=new Address("gzb","UP","india");
        Address address2=new Address("gno","UP","india");
      Emp e = new Emp(101,name1,address1,70,"abc");

        Emp e2 = new Emp(102,name2,address2,90,"xyz");
    }
}
