// Link - https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/



class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length <= 2) 
            return nums.length;
        
        int k=0,i=1,c=1;
        
        while(i<nums.length)
        {
            if(nums[i]==nums[k] && c<2){
                c++;
                k+=1;
                nums[k]=nums[i];
            }  
            else if(nums[i]!=nums[k])
            {
                k+=1;
                nums[k]=nums[i];
                c=1;
            }
            i++;
        }
        return k+1;
      
    }
}
