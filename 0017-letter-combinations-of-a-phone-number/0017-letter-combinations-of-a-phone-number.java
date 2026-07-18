class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> res=new ArrayList<>();
        return combo(digits,0,new StringBuilder(),res,map);
    }
    static List<String> combo(String dig, int idx, StringBuilder diary, List<String> res, HashMap<Character,String> map){
        if (idx==dig.length())
        {
            res.add(diary.toString());
            return res;
        }
        char ch=dig.charAt(idx);
        String com=map.get(ch);
        for (char c : com.toCharArray())
        {
            diary.append(c);
            combo(dig,idx+1,diary,res,map);
            diary.deleteCharAt(diary.length()-1);   // Backtrack
        }
        return res;
    }
}
