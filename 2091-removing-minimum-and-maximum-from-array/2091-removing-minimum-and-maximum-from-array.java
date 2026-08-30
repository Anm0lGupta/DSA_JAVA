class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n <= 2) return n;
        int min = 0;
        // CASE -1 DELETING FROM L -> R
        int minFD = 0;
        int minF = Integer.MAX_VALUE;
        int minFI = -1;
        int maxF= Integer.MIN_VALUE;
        int maxFI = -1;
        for(int i=0; i<n; i++)
        {
            minF = Math.min(nums[i], minF);
            if(nums[i] == minF)
            {
                minFI = i;
            }
            maxF = Math.max(nums[i], maxF);
            if(nums[i] == maxF)
            {
                maxFI = i;
            }            
        }
        minFD = Math.max((minFI+1), (maxFI+1));
        // CASE - 2 DELETING FROM R -> L
        int minBD = 0;
        minBD = Math.max((n-minFI), (n-maxFI));
        // CASE - 3 DELETING FROM L->R & R->L
        int leftIdx = Math.min(minFI, maxFI);
        int rightIdx = Math.max(minFI, maxFI);
        int bothSides = (leftIdx + 1) + (n - rightIdx);
        return Math.min(minFD, Math.min(minBD, bothSides));
    }
}