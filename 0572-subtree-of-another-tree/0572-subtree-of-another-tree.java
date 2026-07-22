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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // Empty tree is always a subtree
        if(subRoot==null)
            return true;

        // Main tree exhausted
        if(root==null)
            return false;

        // Check if current subtree matches
        if (chk(root, subRoot))
            return true;

        // Otherwise search in left or right subtree
        return (isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot));
    }

    static boolean chk(TreeNode r1, TreeNode r2){
        if (r1 == null && r2 == null)
            return true;

        // One node is null -> Not Mirror
        if (r1 == null || r2 == null)
            return false;

        // Values must match
        if (r1.val != r2.val)
            return false;

        // Outer + Inner subtree should be same
        boolean t1 = chk(r1.left, r2.left);
        boolean t2 = chk(r1.right, r2.right);

        return (t1 && t2);
    }

}