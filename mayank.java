
public class mayank {
    static Node head = null,tail = null;
    public static Node insert(int val){
        Node ptr = new Node(val);
        if(head == null){
             head = tail = ptr;
        }
        else{
            tail.next = ptr;
            tail = ptr;
        }
         return head;
    }
    public static void display(){
        Node ptr = head;
        while(ptr!=null){
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }
    public static void main(String[] args) {
        Node a = insert(34);
        Node b = insert(47);
        display();
    }
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}