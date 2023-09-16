// Q.1 Check if a given string is palindrome without reversing the string.

class Solution {
    int isPalindrome(String S) {
        int l= S.length();
        boolean flag= true;
        for(int i=0,j=l-1; i<=j;i++,j--){
            if(S.charAt(i)!=S.charAt(j))
            {
                return 0;
            }
        }
 
 return 1;   }
}
