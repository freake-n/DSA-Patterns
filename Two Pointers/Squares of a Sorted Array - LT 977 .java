// Link - https://leetcode.com/problems/squares-of-a-sorted-array/


class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sq=new int[nums.length];
        int i=0,j=nums.length-1,k=nums.length-1;
        while(k>=0) // adding the larges number at end
        {
            int a=nums[i];
            int b=nums[j];

            if(a*a >= b*b)
            {
                sq[k--]=a*a;
                i++;
            }
            else
            {
                sq[k--]=b*b;
                j--;
            }
        }

        return sq;
    }
}
