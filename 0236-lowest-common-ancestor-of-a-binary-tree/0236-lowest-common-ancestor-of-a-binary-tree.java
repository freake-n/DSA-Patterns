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
        if(root==null || root==p || root==q)
            return root;

        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);

        // One node found on each side -> Current node is LCA
        if(left!=null && right!=null)
            return root;

        // Return the side that found a target node
        if(left!=null)
            return left;
        else
            return right;
    }
}


// OR
// Counting approach
/*

class Solution {

    static TreeNode ans=null;   // global variable

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ans=null;   // reset for each testcase
        int a=lca(root,p,q);
        return ans;
    }

    // Function to count if 2 nodes found 
    static int lca(TreeNode root, TreeNode p, TreeNode q){  
        if(root==null)
            return 0;

        int left=lca(root.left,p,q);
        int right=lca(root.right,p,q);

        int self=0;

        if(root==p || root==q)  // if root itself is either of the nodes
            self=1;

        int total=self+left+right;
        
        if(total == 2 && ans==null) // ans should be null before the first occurance
            ans=root;

        return total;
    }
}

*/