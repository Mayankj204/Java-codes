public class NthNode {
    public class Node{
        int data;
        Node next;
        public Node(int data) {   // find nth element from last  
            this.data = data;     // 10 20 30 40  2nd element from last is 30
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
    public void search(int index){
             Node temp = head;
             int count=0;
             while(temp!=null){
                count++;
                temp=temp.next;
             }
             int m=count-index+1;
             temp=head;
             for(int i=1;i<m;i++){
                temp=temp.next;
             }
             System.out.println("Nth element from last is "+temp.data);
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
        NthNode a = new NthNode();
        a.addLast(10);
        a.addLast(20);
        a.addLast(30);
        a.addLast(40);
        a.addLast(50);
        
        a.printList();
        a.search(2);
    }
    
}
