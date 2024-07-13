//Using Itertor Traverse the ArrayList
import java.util.*;
public class IteratorForTraversing {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("gfg");
        al.add("ide");
        al.add("courses");

        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }
}



