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
    public List<Integer> preorderTraversal(TreeNode root) {
        return pre(root,new ArrayList<>());
    }

    static List<Integer> pre(TreeNode root, ArrayList<Integer> l){
        if(root==null)
            return l;

        // Process current node
        l.add(root.val);

        // Visit entire left subtree first
        pre(root.left, l);

        // Visit entire right subtree
        pre(root.right, l);

        return l;
    }
}