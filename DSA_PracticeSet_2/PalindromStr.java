package DSA_PracticeSet_2;
import java.util.*;

public class PalindromStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.next();

        // Reverse the string
        String rev = new StringBuilder(s).reverse().toString();

        // Compare original and reversed
        if(s.equals(rev)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
