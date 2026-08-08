class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low  = 1;
        int high = 0;
        for(int pile : piles)
        {
            high = Math.max(pile, high);
        }
        int ans = high;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            long hour = 0;
            for(int pile : piles)
            {
                hour += (pile + mid -1)/mid;
            }
            if(hour>h)
            {
                low = mid+1;
            }
            else
            {
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }
}