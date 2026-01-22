package XeboAi;
import java.util.*;
class Node {
    int card;
    Node nextCard;

    Node(int card) {
        this.card = card;
        this.nextCard = null;
    }
}

class Deck {
    Node head;

    void add(int card) {
        Node newNode = new Node(card);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.nextCard != null) {
            temp = temp.nextCard;
        }
        temp.nextCard = newNode;
    }
}

class Solution {

    static Node combine(Node head1, Node head2) {

       Node dummy=new Node(0);
       Node temp=dummy;
       Node n1=head1;
       Node n2=head2;

       while(n1!=null){
        temp.nextCard=n1;
        temp=temp.nextCard;
        temp.nextCard=n2;
        temp=temp.nextCard;
        n1=n1.nextCard;
        n2=n2.nextCard;
       }

        return dummy.nextCard; // replace this
    }
}

public class cardDeck {

    public static void main(String[] args) {

        Solution ob = new Solution();

        // ========= TEST CASE 1 =========
        Deck class1 = new Deck();
        class1.add(1); class1.add(3); class1.add(5);

        Deck class2 = new Deck();
        class2.add(2); class2.add(4); class2.add(6);

        print(ob.combine(class1.head, class2.head));
        // Expected: 1 2 3 4 5 6


        // ========= TEST CASE 2 =========
        Deck class3 = new Deck();
        class3.add(10); class3.add(20); class3.add(30);

        Deck class4 = new Deck();
        class4.add(1); class4.add(2);

        print(ob.combine(class3.head, class4.head));
        // Expected: 10 1 20 2 30


        // ========= TEST CASE 3 =========
        Deck class5 = new Deck();
        class5.add(7);

        Deck class6 = new Deck();
        class6.add(8); class6.add(9); class6.add(10);

        print(ob.combine(class5.head, class6.head));
        // Expected: 7 8 9 10
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.card + " ");
            head = head.nextCard;
        }
        System.out.println();
    }
}
