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
