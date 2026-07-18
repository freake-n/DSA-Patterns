class Solution {
    boolean isPalindrome(String s) {
        return palin(s, 0, s.length() - 1);
    }

    static boolean palin(String s, int st, int en) {
        if (st >= en)
            return true;

        if (s.charAt(st) != s.charAt(en))
            return false;

        return palin(s, st + 1, en - 1);
    }
}