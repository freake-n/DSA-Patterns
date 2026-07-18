class Solution {
    // Function to remove all occurrences of the character from the string
    public void removeCharacter(StringBuilder s, char c) {
        rmv(s,c,0);
    }
    static void rmv(StringBuilder s, char c, int idx){
        if (idx==s.length())
            return;
        if(s.charAt(idx)==c){
            s.deleteCharAt(idx);
            rmv(s,c,idx);
        }
        else  
            rmv(s,c,idx+1);
    }
}