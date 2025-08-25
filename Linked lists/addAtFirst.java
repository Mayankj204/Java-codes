public class addAtFirst {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } 
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        addAtFirst add = new addAtFirst();
        add.addFirst(10);
        add.addFirst(20);
        add.addFirst(30);
        add.addFirst(90);

        add.printList(); // Output: 30 -> 20 -> 10 -> null
    }
}
