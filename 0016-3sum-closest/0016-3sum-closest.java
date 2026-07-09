class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        int i=0;
        while(i<nums.length-2)
        {
            int j=i+1;
            int k=nums.length-1;
            int sum=0;
            while(j<k)
            {
                sum = nums[i] + nums[j] + nums[k];
                int mag = Math.abs(target-sum);
                int clos = Math.abs(target - closestSum);
                if(mag<clos)
                {
                    closestSum = sum;
                }
                if(sum < target)
                {
                    j++;
                }
                else if(sum > target)
                {
                    k--;
                }
                else
                {
                    return sum;
                }
            }
            i++;
        }
        return closestSum;
    }
}