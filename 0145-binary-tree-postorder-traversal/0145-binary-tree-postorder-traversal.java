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
    public List<Integer> postorderTraversal(TreeNode root) {
        return post(root,new ArrayList<>());
    }

    static List<Integer> post(TreeNode root, ArrayList<Integer> l){
        if(root==null)
            return l;

        // Visit entire left subtree
        post(root.left, l);

        // Visit entire right subtree
        post(root.right, l);

        // Process current node
        l.add(root.val);

        return l;
    }
}