package Linked_List;
import java.util.*;

public class ReverseLL {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();

        // Create linked list
        Node head = null;
        Node tail = null;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Reverse the linked list
        head = reverseList(head);

        // Print reversed list
        System.out.println("Reversed Linked List:");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Reverse function
    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextNode = curr.next; // save next
            curr.next = prev;          // reverse pointer
            prev = curr;               // move prev
            curr = nextNode;           // move curr
        }

        return prev; // new head
    }
}
