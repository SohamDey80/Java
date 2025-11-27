package DSA_PracticeSet_2;
import java.util.*;
import java.util.Scanner;


public class ReverseStr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.next();

        // Reverse manually
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        System.out.println("Reversed String: " + rev);
    }
}
