//Traverse the ArrayList Using GetMethod
import java.util.*;
public class GetMethod {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("gfg");
        al.add("ide");
        al.add("course");

        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }
    }
}
