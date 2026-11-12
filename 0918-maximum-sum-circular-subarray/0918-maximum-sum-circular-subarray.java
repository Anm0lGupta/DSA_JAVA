class Solution {
    private int KM(int[] nums, int n)
    {
        int sum = nums[0];
        int max = nums[0];
        for(int i=1; i<n; i++)
        {
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(sum, max);
        }
        return max;
    }
    private int Km(int[] nums, int n)
    {
        int sum = nums[0];
        int min = nums[0];
        for(int i=1; i<n; i++)
        {
            sum = Math.min(sum + nums[i], nums[i]);
            min = Math.min(sum, min);
        }
        return min;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int Sum = 0;
        for(int nu : nums)
        {
            Sum+=nu;
        }
        int min = Km(nums, n);
        int max = KM(nums, n);
        int cir = Sum - min;
        if(max>0)
        {
            return Math.max(max, cir);
        }
        return max;
    }
}