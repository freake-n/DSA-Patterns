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
    public List<Integer> inorderTraversal(TreeNode root) {
        return in(root,new ArrayList<>());
    }
    static List<Integer> in(TreeNode root, ArrayList<Integer> l){
        if(root==null)
            return l;

        // Visit entire left subtree first
        in(root.left, l);

        // Process current node
        l.add(root.val);

        // Visit entire right subtree
        in(root.right, l);
        
        return l;
    }
}