import java.util.*;
public class GetSmallerElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Element of the Array :");
        for(int i=0; i<n; i++){
            a[i] = s.nextInt();
        }
        System.out.println("Enter the value of x :");
        int x = s.nextInt();
        ArrayList<Integer> ans =  smallNums(a,x);

        for(int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }
    public static ArrayList<Integer> smallNums(int a[], int x){
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for(int i=0; i<a.length; i++){
            if(a[i] < x)
                ans.add(a[i]);
        }
        return ans;
    }
}


