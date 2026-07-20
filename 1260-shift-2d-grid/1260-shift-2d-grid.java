class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m*n;
        k = k % total;
        List<List<Integer>> list = new ArrayList<>();
        for(int r=0; r<m; r++)
        {
            List<Integer> row = new ArrayList<>();
            for(int c=0; c<n; c++)
            {
                int flat = r*n + c;
                int org = (flat - k + total)%total;
                int or = (org/n);
                int oc = (org%n);
                row.add(grid[or][oc]);
            }
            list.add(row);
        }
        return list;
    }
}