import java.util.*;
public class InternalWorkingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(100);
        for(int i=0; i<=100; i++){

            al.add(i);
        }
        System.out.println(al);
    }
}
