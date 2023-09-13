// Selection sort
public class Sort{
  public static void main(String[] args){
   int[] arr= {3,4,2,5,1};
   selection(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void selection(int[] arr){
    for(int i=0;i<arr.length;i++){
      int last= arr.length-i-1;    
      int maxIndex= getMaxIndex(arr,0;last);
      swap(arr,maxIndex,last);
    }
  }

  static int getMaxIndex(int[] arr,int start,int end){
     int max= start;
    for(int i=0;i<arr.length;i++)
      {
        if(arr[i]>arr[max])
        {
          max=i;
        }
      }
   return max; 
  }

  static void swap(int[] arr,int first,int second)
  {
    int temp= first;
    first=second;
    second= temp;
  }
}
