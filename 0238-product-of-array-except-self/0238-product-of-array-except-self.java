class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] Lp = new int[nums.length];
        Lp[0] = nums[0];
        for(int i=1; i<nums.length-1; i++)
        {
            Lp[i] = Lp[i-1]*nums[i];
        }
        int[] Rp = new int[nums.length];
        Rp[nums.length-1] = nums[nums.length-1];
        for(int j=nums.length-2; j>=0; j--)
        {
            Rp[j] = Rp[j+1]*nums[j];
        }
        int[] Arr = new int[nums.length];
        Arr[0] = Rp[1];
        Arr[nums.length-1] = Lp[nums.length-2];
        for(int k=1; k<=nums.length-2; k++)
        {
            Arr[k] = Lp[k-1]*Rp[k+1];
        }
        return Arr;
    }
}