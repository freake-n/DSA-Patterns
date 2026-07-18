class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        per(res, 0, nums, new ArrayList<Integer>());
        return res;
    }

    static void per(List<List<Integer>> res, int idx, int[] nums,  List<Integer> diary){
        if (idx==nums.length)
        {
            res.add(new ArrayList<>(diary));
            return;
        }
        for (int n:nums)
        {
            if (diary.contains(n))  // Skip numbers already used in the current permutation.
                continue;
            diary.add(n);
            per(res,idx+1,nums,diary);
            diary.remove(diary.size()-1);
        }
        return;
    }
}