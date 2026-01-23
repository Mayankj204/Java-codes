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

    static Node reorganizeShelf(Node headA, Node headB) {

        Node dummy=new Node(0);
        Node temp=dummy;
        Node nodeA=headA;
        Node nodeB=headB;

        if(nodeA==null) return headB;
        if(nodeB==null) return headA;
        while(nodeA!=null && nodeA.next!=null  && nodeB!=null){
            temp.next=nodeA;
            temp=temp.next;
            nodeA=nodeA.next;

            temp.next=nodeA;
            temp=temp.next;
            nodeA=nodeA.next;

            temp.next=nodeB;
            nodeB=nodeB.next;
            temp=temp.next;

        }
        if(nodeA!=null ) temp.next=nodeA ;
        if(nodeB!=null) temp.next=nodeB;

        

        return dummy.next; 
    }
}

public class Main {

    public static void main(String[] args) {

        // ========= TEST CASE 1 =========
        LinkedList A1 = new LinkedList();
        A1.add(1); A1.add(2); A1.add(3); A1.add(4); A1.add(5);

        LinkedList B1 = new LinkedList();
        B1.add(10); B1.add(20); B1.add(30);

        print(Solution.reorganizeShelf(A1.head, B1.head));
        // Expected: 1 2 10 3 4 20 5 30


        // ========= TEST CASE 2 =========
        LinkedList A2 = new LinkedList();
        A2.add(5); A2.add(6); A2.add(7);

        LinkedList B2 = new LinkedList();
        B2.add(1); B2.add(2); B2.add(3); B2.add(4); B2.add(8);

        print(Solution.reorganizeShelf(A2.head, B2.head));
        // Expected: 5 6 1 7 2 3 4 8


        // ========= TEST CASE 3 =========
        LinkedList A3 = new LinkedList();
        A3.add(1); A3.add(2);

        LinkedList B3 = new LinkedList();
        B3.add(9);

        print(Solution.reorganizeShelf(A3.head, B3.head));
        // Expected: 1 2 9
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
