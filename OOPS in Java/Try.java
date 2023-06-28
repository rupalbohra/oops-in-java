import java.util.*;

public class Try{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int T = sc.nextInt();

        int[] arr = new int[T];
        System.out.println("Enter the elements:");

        for(int i = 0; i<T; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(arr);

        
    }
}