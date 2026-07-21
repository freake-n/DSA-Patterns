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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        lvl(root,res);
        Collections.reverse(res);   // Reversing the list to get the bottom up traversal
        return res;
    }

    static void lvl(TreeNode root, List<List<Integer>> res)
    {
        if(root==null)
            return;

        Queue<TreeNode>  q =new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int lvlsize=q.size();
            List<Integer> temp=new ArrayList<>();

            while(lvlsize>0)
            {
                TreeNode t=q.poll();
                temp.add(t.val);

                if(t.left!=null)
                    q.add(t.left);
                if(t.right!=null)
                    q.add(t.right);
                
                lvlsize--;
            }

            res.add(temp);
        }
    }
}