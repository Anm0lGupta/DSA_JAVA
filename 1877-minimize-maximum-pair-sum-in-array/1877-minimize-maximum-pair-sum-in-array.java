class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxPair = 0;
        for(int i=0; i<nums.length/2; i++)
        {
            int minPair = nums[i] + nums[nums.length-1-i];
            if(minPair>=maxPair)
            {
                maxPair = minPair;
            }
        }
        return maxPair;
    }
}