package Mountain;
import java.util.*;

class Node {
    int height;
    Node next;

    Node(int height) {
        this.height = height;
        this.next = null;
    }
}

class Trail {
    Node head;

    void add(int height) {
        Node newNode = new Node(height);
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

// 👇 Public class name MUST match file name
public class Mountain {

    static Node cleanTrail(Node head) {

        Node curr=head;
        Node prev=null;
        Node next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node dummy=new Node(0);
        Node temp=dummy;
       
        curr=prev;
        int max=Integer.MIN_VALUE;
        while(curr.next!=null){
            if(curr.height>=max){
                max=curr.height;
                  temp.next=curr;
                temp=temp.next;     
        }
            curr=curr.next;
        
    }
    curr=dummy.next;
    next=null;
    prev=null;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }

        return  prev; // replace this
    }

    public static void main(String[] args) {

        // ========= TEST CASE 1 =========
        Trail t1 = new Trail();
        t1.add(12); t1.add(15); t1.add(10); t1.add(11);
        t1.add(5); t1.add(6); t1.add(2); t1.add(3);

        print(cleanTrail(t1.head));
        // Expected: 15 11 6 3


        // ========= TEST CASE 2 =========
        Trail t2 = new Trail();
        t2.add(10); t2.add(9); t2.add(8); t2.add(7);

        print(cleanTrail(t2.head));
        // Expected: 10 9 8 7


        // ========= TEST CASE 3 =========
        Trail t3 = new Trail();
        t3.add(1); t3.add(2); t3.add(3); t3.add(4);

        print(cleanTrail(t3.head));
        // Expected: 4
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.height + " ");
            head = head.next;
        }
        System.out.println();
    }
}
