class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }
        
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low)/2;
            int daysNeeded = 1;
            int currentLoad = 0;
            for (int w : weights) {
                if (currentLoad + w > mid) {
                    daysNeeded++;
                    currentLoad = 0; 
                }
                currentLoad += w;
            }
            if (daysNeeded <= days) {
                ans = mid;         
                high = mid - 1;
            } else {
                low = mid + 1;    
            }
        }
        
        return ans;
    }
}