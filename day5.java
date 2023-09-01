// 1. Swap two numbers in an array using their indexes.
import java.util.Arrays;
public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {3,7,4,2,8,5,4};
       swap(arr, 2,5);
       System.out.println(Arrays.toString(arr));
	
	}
	static void swap(int[] arr, int index1,int index2) {
		int temp= arr[index2];
		arr[index2]= arr[index1];
		arr[index1]= temp ;
	}
}


// 2. Maximum number in the array
import java.util.Arrays;
import java.util.Iterator;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {3,7,4,2,8,5,4};
       int result = max(arr);
       System.out.println(result);
       
	
	}
	static int max(int[] arr) {
	    int maxVal=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>maxVal)
				maxVal= arr[i];
		}
	    return maxVal; 
	}
	

}
