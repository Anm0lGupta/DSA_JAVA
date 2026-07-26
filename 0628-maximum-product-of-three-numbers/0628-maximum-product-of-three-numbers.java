class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n==3) return nums[n-1]*nums[n-2]*nums[n-3];
        int neg = 0;
        for(int num : nums)
        {
            if(num<0) neg++;
        }
        if(neg==0) return nums[n-1]*nums[n-2]*nums[n-3];
        if(neg==1) return nums[n-1]*nums[n-2]*nums[n-3];
        if(neg==n) return nums[n-1]*nums[n-2]*nums[n-3];
        int neg1 = Math.abs(nums[0]);
        int neg2 = Math.abs(nums[1]);
        int sum = neg1*neg2*nums[n-1];
        int max = nums[n-1]*nums[n-2]*nums[n-3];
        if(sum >= max) return sum;
        return max;
    }
}