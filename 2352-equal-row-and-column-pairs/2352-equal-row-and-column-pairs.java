class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<List<Integer>, Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<n; j++)
            {
                list.add(grid[i][j]);
            }
            mp.put(list, mp.getOrDefault(list, 0) + 1);
        }
        int count = 0;
        for(int j=0; j<n; j++)
        {
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<n; i++)
            {
                list.add(grid[i][j]);
            }
            count+=mp.getOrDefault(list, 0);
        }
        return count;
    }
}