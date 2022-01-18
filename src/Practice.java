import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Practice {
    public static <T> List<T> convertALtoLL(ArrayList<T> ArrayList)
    {
        List<T> linkedList = new LinkedList<>();

        for (T e: ArrayList) {
            linkedList.add(e);
        }

        return linkedList;
    }
    public static void main(String[] args) {
        ArrayList <String>al=new ArrayList<>(Arrays.asList("gla","in","welcome","gla","out"));
        al.removeAll(Collections.singleton("gla"));
        for (String str:al) {
            System.out.println(str);
        }
        LinkedList<String> ll = (LinkedList<String>) convertALtoLL(al);
        System.out.println(ll);

    }
}
