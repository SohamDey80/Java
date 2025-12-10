package LittleTest;
import java.util.Scanner;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rev = 0;

        while (num > rev) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        if (num == rev || num == rev / 10) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }

        sc.close();
    }
}

