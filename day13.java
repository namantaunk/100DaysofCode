//Find Minimum in Rotated Sorted Array


class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end= nums.length-1;
        int min= Integer.MAX_VALUE;
        while(start<=end)
        {
            int mid= start + (end-start)/2;
            if(nums[start]<=nums[mid]){
                min= min<nums[start]?min:nums[start];
                start=mid+1;
            }
            else{
                min=min<nums[mid+1]?min:nums[mid];
                end=mid-1;            
            }
        }
  return min;  }
}
