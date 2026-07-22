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
    public boolean flipEquiv(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;

        if(p==null || q==null)
            return false;

        if(p.val != q.val)
            return false;

        // Case 1: No Flip
        boolean t1 = flipEquiv(p.left, q.left);
        boolean t2 = flipEquiv(p.right, q.right); 

        // Case 2: Flip
        boolean t3=flipEquiv(p.left,q.right);
        boolean t4=flipEquiv(p.right,q.left);

        // Either No Flip or Flip should match
        return ((t1 && t2) || (t3 && t4));
    }
}