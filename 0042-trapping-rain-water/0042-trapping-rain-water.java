class Solution {
    public int trap(int[] nums) {
        int store = 0;
        int i = 0;
        int j = nums.length-1;
        int left = 0;
        int right = 0;
        while(i<j)
        {
            left = Math.max(left, nums[i]);
            right = Math.max(right, nums[j]);
            
            if(nums[i] <= nums[j])
            {
                store += left - nums[i];
                i++;
            }
            else
            {
                store += right - nums[j];
                j--;
            }
        }
        return store;
    }
}