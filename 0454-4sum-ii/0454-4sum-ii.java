class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums1.length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                int x = nums3[i] + nums4[j];
                mp.put(x, mp.getOrDefault(x, 0) +1);
            }
        }
        int ans = 0;
        for(int i = 0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                int x = nums1[i] + nums2[j];
                ans+=mp.getOrDefault(-x, 0);
            }
        }
        return ans;
    }
}