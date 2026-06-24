class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int j = 1;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] == nums[j-1])
            {
                count++;
                if(count<=2)
                {
                    nums[j] = nums[i];
                    j++;
                }
            }
            else
            {
                count = 1;
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}