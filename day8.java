//Q.1 Find Smallest Letter Greater Than Target.
/*You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters. */



class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start= 0;
        int end= letters.length-1;
        while(start<=end)
        {
            int mid= start + (end-start)/2;
            if(target>letters[mid])
            {
                start=mid+1;
            }
            else if(target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
    return letters[start % letters.length];
    }
}

//--------------------------------------------------------------------------------------------------------

// Q.2 Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
class Solution {
    public int searchInsert(int[] nums, int target) {
       int start= 0;
		int end = nums.length -1 ;
		while(start<=end)
		{
			int mid= start + (end-start)/2;
			 if(target>nums[mid])
			 {
				 start=mid+1;
			 }
			 else if(target<nums[mid])
			 {
				 end= mid-1;
			 }
			 else {
				 return mid;
			 }
        } 
        return start;
    }     
}


//-------------------------------------------------------------------------------------------------------

//Q.3 Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
/* Input: nums = [3,0,1]
   Output: 2
   Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums. */


class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int sum1=0;
        int sum2=0;
        for(int i=0; i<=n;i++)
        {
            sum1= sum1+i;
        }
        for(int i=0;i<n;i++)
        {
            sum2= sum2+ nums[i];
        }
       return (sum1-sum2);
    }
}


//Q.4 Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int r=0; r<grid.length;r++)
        {
            for(int c=0; c<grid[r].length;c++)
            {
                if(grid[r][c]<0)
                count++;
            }
        }
    
    return count;}
}
