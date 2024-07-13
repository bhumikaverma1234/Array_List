import java.util.*;
public class GetSetIndexOfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        //add the objects
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(10);
        al.add(40);

        System.out.println(al);
        //get the value which is presesnt on(index)
        System.out.println(al.get(1));

        //set(index,object)
        al.set(1,40);

        System.out.println(al.get(1));
        //indexOf method
        System.out.println(al.indexOf(10));
        //lastIndexOf method
        System.out.println(al.lastIndexOf(10));
        //find the object which is not present in the array
        System.out.println(al.indexOf(50));
    }
}
