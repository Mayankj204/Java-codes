package Trees.Traversal;

public class postorder {

        public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

   public static void post(Node root) {
    if (root == null) return;
    post(root.left);
    post(root.right);
    System.out.print(root.data + " ");
    
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
        post(root);

    }
    
}

    

