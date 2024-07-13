import java.util.*;
public class addMethod {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("hello");
        al.add("Engineer");
        al.add("Bhumika");

        System.out.println(al);

        al.add(1, "Software");
        System.out.println(al);
    }
}
