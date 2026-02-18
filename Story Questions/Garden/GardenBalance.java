package Garden;

import java.util.*;

import Trees.sumOfNodes;

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
public class GardenBalance {

    static boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        check(root);
        int left=check(root.left);
        int right=check(root.right);
        if(Math.abs(left-right)>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
        
    }

public static int check(TreeNode root){
    if(root==null) return 0;
    return 1+Math.max((check(root.left)),check(root.right));
    }

    // You may create a helper method below
    

    public static void main(String[] args) {

        // ========= TEST CASE 1 (Balanced) =========
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);

        System.out.println(isBalanced(root1));
        // Expected: true


        // ========= TEST CASE 2 (Unbalanced) =========
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(3);

        System.out.println(isBalanced(root2));
        // Expected: false


        // ========= TEST CASE 3 (Empty Tree) =========
        TreeNode root3 = null;

        System.out.println(isBalanced(root3));
        // Expected: true


        // ========= TEST CASE 4 (Single Node) =========
        TreeNode root4 = new TreeNode(10);

        System.out.println(isBalanced(root4));
        // Expected: true
    }
}
