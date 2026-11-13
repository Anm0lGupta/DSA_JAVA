class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int row = rowSum.length;
        int col = colSum.length;
        int r = 0;
        int c = 0;
        int res[][] = new int[row][col];
        while(r<row && c<col)
        {
            int min = Math.min(rowSum[r], colSum[c]);
            res[r][c] = min;
            rowSum[r] -= min;
            colSum[c] -= min;
            if(rowSum[r] == 0)
            {
                r++;
            }
            else
            {
                c++;
            }
        }
        return res;
    }
}