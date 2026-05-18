// Link - https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1;
        while(j<nums.length)
        {
            if(nums[j]==nums[i])
                j++;
            else{
                i=i+1;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}


// ---------------------------------------------------------------------------------------------


class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0,i=1;
        while(i<nums.length)
        {
            if(nums[i]!=nums[k])
            {
                k+=1;
                nums[k]=nums[i];
            }
            i++;
        }
        return k+1;
    }
}
