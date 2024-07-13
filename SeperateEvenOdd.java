import java.util.*;
public class SeperateEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the numbers : ");
        for(int i=0; i<n; i++){

            a[i] = sc.nextInt();
        }
        getEvenOdd(a);
    }

public static void getEvenOdd(int a[]){
    ArrayList<Integer> even = new ArrayList<Integer>();
    ArrayList<Integer> odd = new ArrayList<Integer>();
    for(int i=0; i<a.length; i++){
        if(a[i] % 2 == 0){
            even.add(a[i]);
        }
        else{
            odd.add(a[i]);
        }
    }
    for(int i=0; i<odd.size(); i++){
        System.out.println("Odd number is :" + odd.get(i)+ " ");
    }
    for(int i=0; i< even.size(); i++){
        System.out.println("Even number is :" + even.get(i)+ " ");
    }

}
}
