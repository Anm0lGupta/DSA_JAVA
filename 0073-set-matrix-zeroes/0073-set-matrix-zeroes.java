class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        Set<Integer> setRow = new HashSet<>();
        Set<Integer> setCol = new HashSet<>();
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(matrix[i][j] == 0)
                {
                    setRow.add(i);
                    setCol.add(j);
                }
            }
        }
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(setRow.contains(i) || setCol.contains(j))
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}