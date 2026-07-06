class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int index = 1;
        arr[0] = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            arr[index] = arr[index-1] + nums[i];
            index++;
        }
        return arr;
    }
}