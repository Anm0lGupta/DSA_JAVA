class Solution {
    public int maxDigitRange(int[] nums) {

        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++)
            {
                int max = Integer.MIN_VALUE;
                int min =  Integer.MAX_VALUE;
                int tempval = nums[i];
                while(tempval > 0)
                    {
                        int val = tempval%10;
                        if(val > max)
                        {
                            max = val;
                        }
                        if(val < min)
                        {
                            min = val;
                        }
                        tempval = tempval/10;
                    }
                int diff = max - min;
                mp.put(nums[i], diff);
            }
        int piku = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : nums)
            {
                int temp = mp.get(num);
                if(temp>piku)
                {
                    piku = temp;
                    sum=num;
                }
                else if(piku == temp)
                {
                    sum += num;
                }
            }
        return sum;
    }
}