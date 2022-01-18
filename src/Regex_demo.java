import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_demo {
    public static void main(String[] args) {
        Pattern p=Pattern.compile(".s");
        Matcher m=p.matcher("as");
        boolean b=m.matches();
        boolean b2=Pattern.matches(".s","as");
        boolean b3=Pattern.compile("..s").matcher("asp").matches();
        //System.out.println(b+" "+b2+" "+b3);
        System.out.println(Pattern.matches("[amn]*", "m"));
    }
}
