class Solution {
    public int[] findDegrees(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] output = new int[row];
        for(int i=0; i<row; i++)
        {
            int count = 0;
            for(int j=0; j<col; j++)
            {
                count += matrix[i][j];
            }
            output[i] = count;
        }
        return output;
    }
}