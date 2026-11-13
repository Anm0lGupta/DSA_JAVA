class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        Set<Integer> setRow = new HashSet<>();
        Set<Integer> setCol = new HashSet<>();
        for(int i=0; i<row; i++)
        {
            int minVal = matrix[i][0];
            for(int j=0; j<col; j++)
            {
                minVal = Math.min(minVal, matrix[i][j]);
            }
            setRow.add(minVal);
        }
        for(int i=0; i<col; i++)
        {
            int maxVal = matrix[0][i];
            for(int j=0; j<row; j++)
            {
                maxVal = Math.max(maxVal, matrix[j][i]);
            }
            setCol.add(maxVal);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(setRow.contains(matrix[i][j]) && setCol.contains(matrix[i][j]))
                {
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
}