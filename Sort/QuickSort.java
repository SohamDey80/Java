package Sort;
import java.util.Arrays;
import java.util.Scanner;


public class QuickSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to input: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Before sorting: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int index = getIndex(arr, left, right);
        quickSort(arr, left, index - 1);
        quickSort(arr, index + 1, right);
    }

    public static int getIndex(int[] arr, int start, int end) {
        int left = start;
        int right = end - 1;
        int pivot = arr[end];

        while (true) {
            while (left < arr.length && arr[left] < pivot) {
                left++;
            }
            while (right >= 0 && arr[right] > pivot) {
                right--;
            }
            if (left >= right) {
                break;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        int temp2 = arr[end];
        arr[end] = arr[left];
        arr[left] = temp2;

        return left;
    }
}
