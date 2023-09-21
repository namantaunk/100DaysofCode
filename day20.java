//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.


class Solution {
    public int removeElement(int[] nums, int val) {
       int index=0;
       for(int i=0; i<nums.length; i++){
           if(nums[i]!=val){
                nums[index]=nums[i];
                index++;               
           }
       }
      return index;  
    }
}



// TWO SUM

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=0,b=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=nums.length-1;j>i;j--)
            {
                if(nums[i]+nums[j]==target)
                {
                    a=i;
                    b=j;
                }
            }
        }
        int[] ans= {a,b};
        return ans;
    }
}
