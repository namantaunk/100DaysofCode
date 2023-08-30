// Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0; i<arr.length; i++)
        {
           if(arr[i]==0){
                   for(int j=arr.length-1; j>=i+1;j--)
                {
                    arr[j]=arr[j-1];
                }
                i++;           
           }
        }       
            }
        }
