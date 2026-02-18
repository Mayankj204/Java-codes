

class Node {
    int coach;
    Node next;

    Node(int coach) {
        this.coach = coach;
        this.next = null;
    }
}

class Train {
    Node head;

    void add(int coach) {
        Node newNode = new Node(coach);
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

// 👇 CLASS NAME CHANGED
class RailwayManager {

    static Node arrangeTrains(Node headA, Node headB) {

        Node dummy = new Node(0);
        Node temp = dummy;
        Node nodeA = headA;
        Node nodeB = headB;
        if (nodeA == null)
            return nodeB;
        if (nodeB == null)
            return nodeA;

        while (nodeA != null && nodeB != null && nodeB.next != null) {
            temp.next = nodeA;
            temp = temp.next;
            nodeA = nodeA.next;

            temp.next = nodeB;
            temp = temp.next;
            nodeB = nodeB.next;

            temp.next = nodeB;
            temp = temp.next;
            nodeB = nodeB.next;
        }

        if (nodeA != null) {
            temp.next = nodeA;
            temp = temp.next;
        }
        if (nodeB != null)
            temp.next = nodeB;

        return dummy.next; // replace this
    }
}

public class Rail {

    public static void main(String[] args) {

        // ========= TEST CASE 1 =========
        Train A1 = new Train();
        A1.add(1);
        A1.add(2);
        A1.add(3);
        A1.add(4);

        Train B1 = new Train();
        B1.add(10);
        B1.add(20);
        B1.add(30);
        B1.add(40);
        B1.add(50);

        print(RailwayManager.arrangeTrains(A1.head, B1.head));
        // Expected: 1 10 20 2 30 40 3 50 4

        // ========= TEST CASE 2 =========
        Train A2 = new Train();
        A2.add(5);
        A2.add(6);

        Train B2 = new Train();
        B2.add(1);
        B2.add(2);
        B2.add(3);
        B2.add(4);

        print(RailwayManager.arrangeTrains(A2.head, B2.head));
        // Expected: 5 1 2 6 3 4

        // ========= TEST CASE 3 =========
        Train A3 = new Train();
        A3.add(9);

        Train B3 = new Train();
        B3.add(7);
        B3.add(8);

        print(RailwayManager.arrangeTrains(A3.head, B3.head));
        // Expected: 9 7 8
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.coach + " ");
            head = head.next;
        }
        System.out.println();
    }
}
