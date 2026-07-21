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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        int l2r=1; // Flag to track the order sequence
        zz(root,res,l2r);
        return res;
    }

    static void zz(TreeNode root, List<List<Integer>> res, int l2r)
    {
        if(root==null)
            return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty())
        {
            // Number of nodes present in the current level
            int lvlsize=q.size();
            List<Integer> temp=new ArrayList<>();

            while(lvlsize>0)
            {
                TreeNode t=q.poll();
                if(l2r==1)
                    temp.add(t.val);    // Left -> Right
                else if(l2r==0)
                    temp.add(0,t.val);  // Right -> Left

                if(t.left!=null)
                    q.add(t.left);
                if(t.right!=null)
                    q.add(t.right);
                    
                lvlsize--;
            }

            l2r=1-l2r;  // swapping order
            res.add(temp);
        }
    }
}