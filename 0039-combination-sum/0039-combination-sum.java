class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res =new ArrayList<>();
        com(candidates, target, res, 0, 0, new ArrayList<>());
        return res;
    }

    static void com(int[] candidates, int target, List<List<Integer>> res, int idx, int sum, ArrayList<Integer> diary){
        if(sum==target) // Target achieved -> store current combination
        {
            res.add(new ArrayList<>(diary));
            return;
        }
        if (idx==candidates.length) // No more candidates left
            return;

        int n=candidates[idx];
        // Take current candidate only if target won't exceed
        if((sum+n)<=target)
        {
            diary.add(n);
            sum+=n;
            // Stay at same index because this element can be chosen multiple times.
            com(candidates,target,res,idx,sum,diary);
            diary.remove(diary.size()-1);
            sum-=n;
        }

        // Ignore current candidate and move to next.
        com(candidates,target,res,idx+1,sum,diary); 
        return;
    }
}