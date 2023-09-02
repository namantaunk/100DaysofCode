// LINEAR SEARCH
//QUESTION- RICHEST CUSTOMER WEALTH
// PROBLEM STATEMENT - You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int row=0; row<accounts.length; row++)
        {   int rowsum=0;
            for(int col=0; col<accounts[row].length; col++)
            {
                rowsum+= accounts[row][col];
            }
            if(rowsum>max)
            max=rowsum;
        }
        return max;
    }
}
