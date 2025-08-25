package Trees;

public class maxValue {
        public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
   public static int max(Node root) {
    if (root == null) return Integer.MIN_VALUE;
    int leftMax = max(root.left);
    int rightMax = max(root.right);
    return Math.max(root.data, Math.max(leftMax, rightMax));


   }
   

    public static void main(String[] args) {
        Node root = new Node(-1);   // Negative answer
        Node a = new Node(-2);
        Node b = new Node(-300);
        Node c = new Node(-40);
        Node d = new Node(-5);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
     System.out.println(max(root));

    }
}
