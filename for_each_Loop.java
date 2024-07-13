//Traverse ArrayList using for_each loop
import java.util.*;
public class for_each_Loop {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("gfg");
        al.add("ide");
        al.add("courses");

        for(String s:al){
            System.out.println(s);
        }
    }
}
