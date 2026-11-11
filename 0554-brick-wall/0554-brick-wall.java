class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int untouched = 0;
        Map<Long, Integer> mp = new HashMap<>();
        for(List<Integer> w : wall)
        {
            long end = 0;
            for(int i=0; i<w.size()-1; i++)
            {
                end+=w.get(i);
                mp.put(end, mp.getOrDefault(end, 0) + 1);
                untouched = Math.max(untouched, mp.get(end));
            }
        }
        return wall.size() - untouched;
    }
}