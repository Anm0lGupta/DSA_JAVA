class Solution {
    private int findMax(int[][] grid, int i, int j)
    {
        int max = Integer.MIN_VALUE;
        for(int r=i; r<i+3; r++)
        {
            for(int c=j; c<j+3; c++)
            {
                max = Math.max(max, grid[r][c]);
            }
        }
        return max;
    }
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length; // 4
        int res[][] = new int[n-2][n-2];
        for(int i=0; i<n-2; i++)
        {
            for(int j=0; j<n-2; j++)
            {
                res[i][j] = findMax(grid, i, j);
            }
        }
        return res;
    }
}