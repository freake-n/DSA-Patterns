/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        // Ensure p has the smaller value and q the larger value
        if(p.val<q.val)
            return lca(root,p,q);
        return lca(root,q,p);
    }

    static TreeNode lca(TreeNode root, TreeNode p, TreeNode q){
        if(root==null || root==p || root==q)
            return root;

        // Both nodes are in the right subtree since root is smaller than p
        if(root.val<p.val)
            return lca(root.right,p,q);

        // Both nodes are in the left subtree sice  root is larger than q
        if(root.val>q.val)
            return lca(root.left,p,q);
        
        // Current node lies between p and q -> LCA
        return root;
    }
}