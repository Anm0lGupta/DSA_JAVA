class Solution {
    public void rotate(int[] nums, int k) {
        int[] A = new int[nums.length];
        for(int j=nums.length-1; j>=0; j--)
        {
            A[(j+k)%nums.length] = nums[j];
        }
        int index = 0;
        for(int num : A)
        {
            nums[index] = num;
            index++;
        }
    }
}