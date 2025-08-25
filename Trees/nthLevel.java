package Trees;
public class nthLevel {
      public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    public static int height(Node root) {
    if(root==null) return 0;
    else return 1+Math.max(height(root.left),height(root.right));
   }

   public static void level(Node root , int level) { 
    if (root == null) return;
    if(level==1) System.out.print(root.data +" ");
    level(root.left,level-1);
    level(root.right,level-1);
   
   }
   

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
    level(root,3);       // printing one level only
   
System.out.println();
System.out.println();
     int h=height(root);
    for(int i=0;i<=h;i++){
        level(root,i);
        System.out.println();
    }
    }
    
}
