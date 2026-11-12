
class Solution {
    public void nextPermutation(int[] nums) {
        int i;
        for(i = nums.length-2; i >= 0; i--)
        {
            if(nums[i] < nums[i+1])
            {
                break;
            }
        }
        if(i < 0)
        {
            Arrays.sort(nums);
            return;
        }
        for(int j = nums.length-1; j > i; j--)
        {
            if(nums[j] > nums[i])
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                break;
            }
        }
        int left = i+1;
        int right = nums.length-1;
        while(left < right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
