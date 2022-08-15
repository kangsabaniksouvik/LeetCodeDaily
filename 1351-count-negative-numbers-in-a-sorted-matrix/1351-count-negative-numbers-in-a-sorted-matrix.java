class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length, n=grid[0].length,i,j,c=0;
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                if(grid[i][j]<0)
                    c++;
        return c;
    }
}