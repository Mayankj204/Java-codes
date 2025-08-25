package Trees;
public class construct {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node root) {
        if(root==null) return;
        System.out.print(root.data +" ");
        if (root.left != null)
            System.out.print(root.left.data + " ");
        if (root.right != null)
            System.out.print(root.right.data);
            System.out.println();
        display(root.left);
        display(root.right);

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
        display(root);

    }

}
