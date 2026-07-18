class Solution {
    static int sumOfDigits(int n) {
        if (n==0)
            return n;
        int curr=n%10;
        return curr+sumOfDigits(n/10);
    }
}
