package Array;
import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input size
        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read k
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        // Normalize k (if k > n)
        k = k % n;

        // Create new array for rotated result
        int[] rotated = new int[n];

        int index = 0;

        // Copy last k elements first
        for (int i = n - k; i < n; i++) {
            rotated[index++] = arr[i];
        }

        // Then copy first n-k elements
        for (int i = 0; i < n - k; i++) {
            rotated[index++] = arr[i];
        }

        // Print result
        System.out.println("Rotated Array:");
        for (int x : rotated) {
            System.out.print(x + " ");
        }
    }
}
