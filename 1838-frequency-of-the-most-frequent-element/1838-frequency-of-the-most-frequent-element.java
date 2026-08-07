class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length; 
        Arrays.sort(nums); 
        int result = 0; 
        long[] prefixSum = new long[n];
        prefixSum[0] = nums[0];
        for(int i=1; i<n; i++)
        {
            prefixSum[i] = nums[i] + prefixSum[i-1];
        }
        for(int target_idx = 0; target_idx < n; target_idx++)
        {
            result = Math.max(result, binary(target_idx, k, prefixSum, nums));
        }
        return result;
    }
    static int binary(int target_idx, int k, long[] prefixSum, int[] nums)
    {
        int l = 0;
        int r = target_idx;
        int best_idx = target_idx;
        while(l<=r)
        {
            int mid = l + (r-l)/2;
            long count = target_idx - mid + 1;
            long windowSum = count*nums[target_idx];
            long currSum = prefixSum[target_idx] - prefixSum[mid] + nums[mid];
            long ops = windowSum - currSum;
            if(ops>k)
            {
                l = mid+1;
            }
            else
            {
                best_idx = mid;
                r = mid-1;
            }
        }
        return target_idx - best_idx + 1;
    }
}