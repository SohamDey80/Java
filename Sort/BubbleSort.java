package Sort;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ask user how many numbers they want to input
        System.out.print("Enter how many numbers you want to input: ");
        int n = scan.nextInt();

        // Create array of that size
        int[] arr = new int[n];

        // Take user input for the array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        // Before sort
        System.out.println("Before sorting: " + Arrays.toString(arr));

        // Bubble sort
        bubbleSort(arr);

        // After sort
        System.out.println("After sorting: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int index = arr.length;
        while (index >= 0) {
            for (int i = 0; i < index - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            index--;
        }
    }
}
