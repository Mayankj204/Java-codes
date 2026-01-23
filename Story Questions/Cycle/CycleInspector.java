package Cycle;

import java.util.*;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class Conveyor {
    Node head;

    void add(int val) {
        Node newNode = new Node(val);
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

// 👇 Public class name must match file name
public class CycleInspector {

    static boolean hasCycle(Node head) {
        Node fast=head;
        Node slow=head;
        if(head==null || head.next==null) return false;

        while(fast!=null && fast.next!=null){
            
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) return true;
        }
        return false; // replace this
    }

    public static void main(String[] args) {

        // ========= TEST CASE 1: NO CYCLE =========
        Conveyor c1 = new Conveyor();
        c1.add(1); c1.add(2); c1.add(3); c1.add(4);

        System.out.println(hasCycle(c1.head));
        // Expected: false


        // ========= TEST CASE 2: CYCLE =========
        Conveyor c2 = new Conveyor();
        c2.add(10); c2.add(20); c2.add(30); c2.add(40);

        // create cycle: last node → second node
        Node temp = c2.head;
        Node second = c2.head.next;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = second;

        System.out.println(hasCycle(c2.head));
        // Expected: true


        // ========= TEST CASE 3: SINGLE NODE, NO CYCLE =========
        Conveyor c3 = new Conveyor();
        c3.add(5);

        System.out.println(hasCycle(c3.head));
        // Expected: false
    }
}
