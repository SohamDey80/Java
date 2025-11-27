package DSA_PracticeSet_2;
import java.util.*;

public class SecondLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Simple way: sort the array
        Arrays.sort(arr);

        // Second largest is at index n-2
        System.out.println("Second Largest Element: " + arr[n - 2]);
    }
}
