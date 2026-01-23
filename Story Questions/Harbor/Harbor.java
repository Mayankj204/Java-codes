package Harbor;
import java.util.*;

import Harbor.*;

class Node {
    int id;
    Node next;

    Node(int id) {
        this.id = id;
        this.next = null;
    }
}

class ShippingLine {
    Node head;

    void add(int id) {
        Node newNode = new Node(id);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
}

// 👇 Public class name MUST match file name: Harbor.java
public class Harbor {

    static Node scheduleCargo(Node headA, Node headB) {

       
        

        return null; // replace this
    }

    public static void main(String[] args) {

        // ========= TEST CASE 1 =========
        ShippingLine A1 = new ShippingLine();
        A1.add(1); A1.add(2); A1.add(3); A1.add(4);
        A1.add(5); A1.add(6); A1.add(7);

        ShippingLine B1 = new ShippingLine();
        B1.add(10); B1.add(20);

        print(scheduleCargo(A1.head, B1.head));
        // Expected: 1 2 3 10 4 5 6 20 7


        // ========= TEST CASE 2 =========
        ShippingLine A2 = new ShippingLine();
        A2.add(5); A2.add(6);

        ShippingLine B2 = new ShippingLine();
        B2.add(1); B2.add(2); B2.add(3);

        print(scheduleCargo(A2.head, B2.head));
        // Expected: 5 6 1 2 3
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.id + " ");
            head = head.next;
        }
        System.out.println();
    }
}
