import java.util.*;
public class ContainRemoveMethod {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<String>();
        al.add("geeks");
        al.add("ide");
        al.add("courses");

        System.out.println(al);
        //contains return boolean value
        System.out.println(al.contains("ide"));
        //remove(index)
        al.remove(1);
        System.out.println(al);
        System.out.println(al.contains("ide"));
        //remove object
        al.remove("courses");
        System.out.println(al);
        System.out.println(al.contains("courses"));
    }
}
