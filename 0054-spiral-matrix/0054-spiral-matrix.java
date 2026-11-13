class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int top = 0, bottom = row - 1, left = 0, right = col - 1;
        List<Integer> list = new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            for(int i = left; i<=right; i++)
            {
                list.add(matrix[top][i]);
            }
            top++;
            for(int j = top; j<=bottom; j++)
            {
                list.add(matrix[j][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int k = right; k>= left; k--)
                {
                    list.add(matrix[bottom][k]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int l = bottom; l>=top; l--)
                {
                    list.add(matrix[l][left]);
                }
                left++;
            }
        }
        return list;
    }
}