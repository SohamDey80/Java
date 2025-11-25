package Linked_List;
import java.util.*;

class Main {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input prompts
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " values: ");
        Node head = null, tail = null;

        // Build list
        for (int i = 0; i < n; i++) {
            Node t = new Node(sc.nextInt());
            if (head == null) head = tail = t;
            else { tail.next = t; tail = t; }
        }

        System.out.print("Enter value to delete: ");
        int x = sc.nextInt();

        // Delete head
        if (head != null && head.data == x) {
            head = head.next;
        } else {
            Node temp = head;

            while (temp != null && temp.next != null && temp.next.data != x)
                temp = temp.next;

            if (temp == null || temp.next == null) {
                System.out.println("Not Found");
                return;
            }

            temp.next = temp.next.next;
        }

        // Print result
        System.out.print("Final list: ");
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }
}

