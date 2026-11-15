class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        TreeMap<Integer, List<Integer>> mp = new TreeMap<>();
        int[] result = new int[n*m];
        int k = 0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                mp.computeIfAbsent(i+j, x -> new ArrayList<>())
                .add(matrix[i][j]);
            }
        }
        boolean flip = true;
        for(List<Integer> list : mp.values())
        {
            if(flip)
            {
                Collections.reverse(list);
            }
            for(int num : list)
            {
                result[k++] = num;
            }
            flip = !flip;
        }
        return result;
    }
}