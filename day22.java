// FIND MIN AND MAX ELEMENT IN ARRAY

class Compute 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code herE
        Arrays.sort(a);
        long min= a[0];
        long max=a[(int)n-1];
        Pair ans= new Pair(min, max);
        return ans;
        
    }
}
