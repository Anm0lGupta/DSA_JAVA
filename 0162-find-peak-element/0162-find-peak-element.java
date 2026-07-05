class Solution {
    public int findPeakElement(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == max)
            {
                max = i;
                break;
            }
        }
        return max;
    }
}