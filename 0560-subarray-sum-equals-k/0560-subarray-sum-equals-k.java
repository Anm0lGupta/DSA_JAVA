class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>(); 
        mp.put(0, 1); 
        int n = nums.length; 
        int count = 0;
        int currentSum = 0;
        for(int j=0; j<n; j++)
        {
            currentSum += nums[j];
            int val = currentSum - k;
            if(mp.containsKey(val))
            {
                count = count + mp.get(val);
            }
            mp.put(currentSum, mp.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }
}