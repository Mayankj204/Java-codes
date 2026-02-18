package Forest;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

// 👇 Public class name must match file name
public class ForestDepth {

    static int maxDepth(TreeNode root) {
        if(root==null) return 0;

        return 1+ Math.max(maxDepth( root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {

        // ========= TEST CASE 1 =========
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);

        System.out.println(maxDepth(root1));
        // Expected: 3


        // ========= TEST CASE 2 =========
        TreeNode root2 = new TreeNode(1);

        System.out.println(maxDepth(root2));
        // Expected: 1


        // ========= TEST CASE 3 =========
        TreeNode root3 = null;

        System.out.println(maxDepth(root3));
        // Expected: 0


        // ========= TEST CASE 4 (Skewed Tree) =========
        TreeNode root4 = new TreeNode(1);
        root4.right = new TreeNode(2);
        root4.right.right = new TreeNode(3);
        root4.right.right.right = new TreeNode(4);

        System.out.println(maxDepth(root4));
        // Expected: 4
    }
}
