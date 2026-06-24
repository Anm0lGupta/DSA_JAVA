class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int[] num = new int[nums.length + k];
        for(int i = nums.length - 1; i >= 0; i--)
        {
            num[i+k] = nums[i];
        }
        
        for(int j = num.length-1; j>=0; j--)
        {
            int pos = j-nums.length;
            if(pos >= 0)
            {
                num[j-nums.length] = num[j];
            }
        }
        for(int z=0; z<nums.length; z++)
        {
            nums[z] = num[z];
        }
    }
}