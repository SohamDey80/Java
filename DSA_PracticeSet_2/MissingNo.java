package DSA_PracticeSet_2;
import java.util.*;

public class MissingNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();   // this will be N-1 numbers (because 1 number is missing)

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find actual N → because array size is n, actual N is n+1
        int N = n + 1;

        // Expected sum of 1 to N
        int expectedSum = N * (N + 1) / 2;

        // Sum of array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // Missing number
        int missing = expectedSum - actualSum;

        System.out.println("Missing Number: " + missing);
    }
}

