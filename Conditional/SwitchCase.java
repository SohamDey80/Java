package Conditional;import java.util.*;

public class SwitchCase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button) {
            case 1: System.out.println("Red button");
            break;
            case 2: System.out.println("Yellow button");
            break;
            case 3: System.out.println("Green button");
            break;
            default: System.out.println("Invalid button");
        }
    }
}
