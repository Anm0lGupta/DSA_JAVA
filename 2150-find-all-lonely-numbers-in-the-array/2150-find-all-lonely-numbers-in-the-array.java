class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num : nums)
        {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        for(int num : nums)
        {
            if (mp.get(num) == 1 && !mp.containsKey(num + 1) && !mp.containsKey(num - 1)) {
                list.add(num);
            }
        }

        return list;
    }
}