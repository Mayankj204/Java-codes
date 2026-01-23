package Palindrome;

import java.util.*;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class Route {
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
public class PalindromeRoute {

    static boolean isPalindrome(Node head) {
        Node fast=head;
        Node slow=head;
        if(head==null || head.next==null) return true;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node curr=slow;
        Node prev=null;
        Node next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node first=head;
        Node second=prev;

        while(second!=null){
            if(first.val!=second.val) return false;
            second=second.next;
            first=first.next;
        }

        return true; // replace this
    }

    public static void main(String[] args) {

        // ========= TEST CASE 1 =========
        Route r1 = new Route();
        r1.add(1); r1.add(2); r1.add(3); r1.add(2); r1.add(1);

        System.out.println(isPalindrome(r1.head));
        // Expected: true


        // ========= TEST CASE 2 =========
        Route r2 = new Route();
        r2.add(1); r2.add(2); r2.add(3); r2.add(4);

        System.out.println(isPalindrome(r2.head));
        // Expected: false


        // ========= TEST CASE 3 =========
        Route r3 = new Route();
        r3.add(7);

        System.out.println(isPalindrome(r3.head));
        // Expected: true


        // ========= TEST CASE 4 =========
        Route r4 = new Route();
        r4.add(1); r4.add(2); r4.add(2); r4.add(1);

        System.out.println(isPalindrome(r4.head));
        // Expected: true
    }
}
