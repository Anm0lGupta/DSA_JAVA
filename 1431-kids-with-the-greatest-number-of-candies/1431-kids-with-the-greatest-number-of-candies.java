class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int extra) {
        // lets loop through every kid
        List<Boolean> list = new ArrayList<>();
        int max = -1;
        for(int t : nums)
        {
            if(t>max)
            {
                max = t;
            }
        }
        for(int num : nums)
        {
            if(num + extra >= max)
            // true;
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;
    }
}