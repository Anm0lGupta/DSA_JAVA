class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        long validPoint = 0;
        long result = 0;
        int cumSum = 0;
        for(int j=0; j<nums.length; j++)
        {
            if(nums[j] == target)
            {
                validPoint+=mp.getOrDefault(cumSum, 0);
                cumSum+=1;
            }
            else
            {
                cumSum-=1;
                validPoint-=mp.getOrDefault(cumSum, 0);
            }
            result+=validPoint;
            mp.put(cumSum, mp.getOrDefault(cumSum, 0)+1);
        }
        return result;
    }
}