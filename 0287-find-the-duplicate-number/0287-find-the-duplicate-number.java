class Solution {
    public int findDuplicate(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i-1] == nums[i])
            {
                count = nums[i];
                break;
            }
        }
        return count;
    }
}