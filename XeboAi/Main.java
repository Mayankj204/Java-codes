package XeboAi;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void add(int data) {
        Node newNode = new Node(data);

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

class Solution {

    public Node inventoryManagement(Node list1, Node list2, int a, int b) {
        // Write your code here

        Node pointerA=list1;
       
        Node pointerB=list2;
        for(int i=0;i<a-1;i++){
            pointerA=pointerA.next; 
           
            System.out.println(pointerA.data);
        }

         Node pointerDiff=pointerA;
        for(int i=0;i<=(b-a+1);i++){
            pointerDiff=pointerDiff.next;
        }

        pointerA.next=list2;
       while(pointerB.next!=null){
        pointerB=pointerB.next;   
       }
       pointerB.next=pointerDiff;    
        return list1;

     
    }
}

public class Main {

    public static void main(String[] args) {

    Solution solution = new Solution();

    // ================= TEST CASE 1 =================
    LinkedList l1 = new LinkedList();
    l1.add(0); l1.add(1); l1.add(2); l1.add(3); l1.add(4); l1.add(5);

    LinkedList l2 = new LinkedList();
    l2.add(10); l2.add(11); l2.add(12);

    Node result = solution.inventoryManagement(l1.head, l2.head, 3, 4);
    printList(result);   // Expected: 0 1 2 10 11 12 5


    // ================= TEST CASE 2 =================
    LinkedList l3 = new LinkedList();
    l3.add(0); l3.add(1); l3.add(2); l3.add(3); l3.add(4); l3.add(5); l3.add(6);

    LinkedList l4 = new LinkedList();
    l4.add(10); l4.add(11); l4.add(12); l4.add(13); l4.add(14);

    result = solution.inventoryManagement(l3.head, l4.head, 2, 5);
    printList(result);   // Expected: 0 1 10 11 12 13 14 6


    // ================= TEST CASE 3 =================
    LinkedList l5 = new LinkedList();
    l5.add(1); l5.add(2); l5.add(3); l5.add(4); l5.add(5);

    LinkedList l6 = new LinkedList();
    l6.add(100);

    result = solution.inventoryManagement(l5.head, l6.head, 1, 3);
    printList(result);   // Expected: 1 100 5
}
static void printList(Node head) {
    while (head != null) {
        System.out.print(head.data + " ");
        head = head.next;
    }
    System.out.println();
}

}
