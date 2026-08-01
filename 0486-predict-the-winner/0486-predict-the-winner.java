class Solution {
    public boolean predictTheWinner(int[] nums) {
        return func(nums, 0, nums.length-1)>=0;
    }
    private int func(int[] num, int i, int j)
    {
        if(i==j) return num[i];
        int Lp = num[i] - func(num, i+1, j);
        int Rp = num[j] - func(num, i, j-1);
        return Math.max(Lp, Rp);
    }
}