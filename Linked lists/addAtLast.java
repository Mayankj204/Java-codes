public class addAtLast {
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    Node head=null;
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
       
        else{
             Node temp=head;
            while(temp.next!=null){
            temp=temp.next;
            }
              temp.next=newNode;
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
        addAtLast a = new addAtLast();
        a.addLast(10);
        a.addLast(20);
        a.addLast(30);
        a.addLast(40);
        
        a.printList();
    }
    
}
