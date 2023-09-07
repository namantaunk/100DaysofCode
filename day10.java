//Q. Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int r=0; r<grid.length;r++)
        {
            for(int c=0; c<grid[r].length;c++)
            {
                if(grid[r][c]<0)
                count++;
            }
        }
    
    return count;}
}
