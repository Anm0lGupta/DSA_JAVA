class Solution {
    public int singleNumber(int[] nums) {
        int L = 0;
        for(int i=0; i<nums.length; i++)
        {
            L ^= nums[i];
        }
        return L;
    }
}