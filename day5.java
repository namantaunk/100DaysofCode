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
