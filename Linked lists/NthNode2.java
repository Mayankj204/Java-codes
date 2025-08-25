public class NthNode2 {    //  nth node from the end of a linked list in one iteration
    public  class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    } 
    Node head=null;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
        }
        else {
            newNode.next = head;
            head=newNode;
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
       public void search(int position){
        Node fast=head;
        Node slow=head;
        Node temp = head;
        for(int i=1;i<=position;i++){
             fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        System.out.println("The "+position+" node from the end is "+slow.data);
       }


    public static void main(String[] args) {
        NthNode2 list = new NthNode2();
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList(); 
        list.search(3);
    }
}
