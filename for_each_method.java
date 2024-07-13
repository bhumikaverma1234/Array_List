//traversing ArrayList using for_each_method
import java.util.*;
public class for_each_method {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);

        al.forEach(x -> System.out.println(x));
    }
}
