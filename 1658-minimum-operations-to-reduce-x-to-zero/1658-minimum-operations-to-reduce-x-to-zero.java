class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        int n = nums.length;
        for(int num : nums)
        {
            totalSum += num;
        }
        int target = totalSum - x;
        int left = 0;
        int maxLength = -1;
        int currentSum = 0;
        for(int right = 0; right<n; right++)
        {
            currentSum += nums[right];
            while(currentSum > target && left <= right)
            {
                currentSum -= nums[left];
                left++;
            }
            if(currentSum == target)
            {
                maxLength = Math.max(maxLength, right-left+1);
            }
        }
        if(maxLength != -1)
        {
            return n - maxLength;
        }
        return -1;
    }
}