// CHECK IF A NUMBER IS AN ARMSTRONG NUMBER.


class Solution {
    static String armstrongNumber(int n){
        // code here
        int sum=0;
        int ans=n;
        for(int i=0;i<3;i++)
        {
            int digit= n%10;
            sum= sum+ (digit*digit*digit);
            n=n/10;
        }
        if(sum==ans){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}
