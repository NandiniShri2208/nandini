import java.util.ArrayList;
import java.util.Iterator;

public class generic_demo {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("jai");
        arrayList.add("rahul");
        //arrayList.add(23);-->error
        String s=arrayList.get(1);
        //System.out.println(s);
        Iterator <String>itr= arrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
