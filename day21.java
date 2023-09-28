// CYCLICALLY ROTATE ARRAY BY 1

class Compute {
    
    public void rotate(int arr[], int n)
    {   
        for(int i=0,j=n-1;i<n;i++){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        
    }
}
