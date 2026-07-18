class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        String s="";
        return paren(n,res,s,0,0);
    }
    static List<String> paren(int n, List<String> res, String s, int o, int c){
        if(s.length()==(2*n))
        {
            res.add(s);
            return res;
        }
        if (o<n)
            paren(n,res,s+"(",o+1,c);
        if (c<o)
            paren(n,res,s+")",o,c+1);
        return res;
    }
}