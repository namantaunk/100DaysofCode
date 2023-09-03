// BINARY SEARCH
// Q.1 FIND THE CEILING OF THE TARGET NUMBER=16.
// CEILING= smallest number in array, greater or equal to target element.


public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr= {1,2,4,5,6,11,13,15,19,22,25};
		int target =16 ;
		int ans = ceiling(arr,target) ;
		System.out.println(arr[ans]);
		
	}
	
	static int ceiling(int[] arr, int target)
	{  
		int start= 0;
		int end = arr.length -1 ;
		while(start<=end)
		{
			int mid= start + (end-start)/2;
			 if(target>arr[mid])
			 {
				 start=mid+1;
			 }
			 else if(target<arr[mid])
			 {
				 end= mid-1;
			 }
			 else {
				 return mid;
			 }
		
		}
		return start;
		
	}


// Q.2: FIND THE FLOOR OF THE TARGET NUMBER=16.

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr= {1,2,4,5,6,11,13,15,19,22,25};
		int target =16 ;
		int ans = floor(arr,target) ;
		System.out.println(arr[ans]);
		
	}
	
	static int floor(int[] arr, int target)
	{  
		int start= 0;
		int end = arr.length -1 ;
		while(start<=end)
		{
			int mid= start + (end-start)/2;
			 if(target>arr[mid])
			 {
				 start=mid+1;
			 }
			 else if(target<arr[mid])
			 {
				 end= mid-1;
			 }
			 else {
				 return mid;
			 }
		
		}
		return end;
		
	}
}
	
	
