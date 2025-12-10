package LittleTest;
import java.util.Scanner;

public class PatternCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        System.out.print("Enter pattern: ");
        String pat = sc.nextLine();

        int count = 0;
        int i= 0;

        while (i <= str.length() - pat.length()) {
            if (str.substring(i, i + pat.length()).equals(pat)) {
                count++;
                i++;
            } else {
                i++;
            }
        }

        System.out.println("Pattern repeatition: " + count);

    }
}
