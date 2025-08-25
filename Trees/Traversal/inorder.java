package Trees.Traversal;

public class inorder {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void in(Node root) {
        if (root == null)
            return;
        in(root.left);
        System.out.print(root.data + " ");
        in(root.right);

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
        in(root);

    }

}
