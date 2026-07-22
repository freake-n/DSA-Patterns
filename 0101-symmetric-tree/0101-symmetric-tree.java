/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root==null)
            return true;

        // Compare left with right subtrees
        return sym(root.left,root.right);
    }

    static boolean sym(TreeNode left, TreeNode right){
        if(left==null && right==null)
            return true;
        if(left==null || right==null)
            return false;
        if(left.val!=right.val)
            return false;

        // Mirror check (left=right & right=left)
        boolean t1=sym(left.left,right.right);
        boolean t2=sym(left.right,right.left);

        return (t1 && t2);
    }
}