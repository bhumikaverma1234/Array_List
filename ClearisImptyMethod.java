import java.util.*;
public class ClearisImptyMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(10);
        al.add(30);

        //isEmpty -> return(boolean)
        System.out.println(al.isEmpty());
        //clear the arrayList using clear() Method
        al.clear();
        System.out.println(al.isEmpty());


    }
}
