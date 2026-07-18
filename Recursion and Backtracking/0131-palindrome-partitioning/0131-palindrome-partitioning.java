class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        part(s,res,0,new ArrayList<>());
        return res;
    }

    static void part(String s, List<List<String>> res, int idx, List<String> diary){
        if (idx==s.length())
        {
            res.add(new ArrayList<>(diary));
            return;
        }
        // Try every possible substring starting from idx
        for (int end=idx;end<s.length();end++)
        {
            if (palin(s,idx,end))
            {
                diary.add(s.substring(idx,end+1));
                part(s,res,end+1,diary);
                diary.remove(diary.size()-1);
            }
        }
        return;
    }

    // Check whether s[idx...end] is a palindrome
    static boolean palin(String s, int st, int en) {
        if (st >= en)
            return true;

        if (s.charAt(st) != s.charAt(en))
            return false;

        return palin(s, st + 1, en - 1);
    }
}