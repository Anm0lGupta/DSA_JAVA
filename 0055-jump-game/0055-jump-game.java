class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1)
        {
            return true;
        }
        if(nums[0] == 0)
        {
            return false;
        }
        for(int i=0; i< nums.length-1; i++)
        {
            if(nums[i] == 0)
            {
                boolean canSurpass = false;
                for(int k=i-1; k>=0; k--)
                {
                    if(k+nums[k] >i)
                    {
                        canSurpass = true;
                        break;
                    }
                }
                if(!canSurpass)
                {
                    return false;
                }
            }
            
        }
        return true;
    }
}