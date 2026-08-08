class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> UniqueSet = new HashSet<>();
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                Set<Long> set = new HashSet<>();
                for(int k=j+1; k<n; k++)
                {
                    long sum = (long) nums[i] + nums[j] + nums[k];
                    long fourth = target - sum;
                    if(set.contains(fourth))
                    {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k], (int)fourth);
                        Collections.sort(list);
                        UniqueSet.add(list);
                    }
                    set.add((long) nums[k]);
                }
            }
        }
        return new ArrayList<>(UniqueSet);
    }
}