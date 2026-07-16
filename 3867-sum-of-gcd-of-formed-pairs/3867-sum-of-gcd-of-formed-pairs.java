class Solution {
    public long gcdSum(int[] nums) {
        int[] prefixGcd = new int[nums.length];
        int max = 0;
        for(int i=0; i<nums.length; i++)
        {
            max = Math.max(nums[i], max);
            prefixGcd[i] = gcd(nums[i], max);
        }
        Arrays.sort(prefixGcd);
        long sum = 0;
        for(int j=0; j<nums.length/2; j++)
        {
            sum+= gcd(prefixGcd[j], prefixGcd[nums.length - 1 - j]);
        }
        return sum;
    }
    private int gcd(int a, int b)
    {
        while(a!=0)
        {
            int temp = a;
            a = b%a;
            b = temp;
        }
        return b;
    }
}