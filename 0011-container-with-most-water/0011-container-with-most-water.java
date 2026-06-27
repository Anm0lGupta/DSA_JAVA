class Solution {
    public int maxArea(int[] height) {
        int water = 0;
        int i = 0;
        int j = height.length-1;
        while(i<j)
        {
            int l = Math.min(height[i], height[j]);
            int w = j-i;
            int max = l*w;
            if(max>water)
            {
                water = max;
            }
            if(height[i] < height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return water;
    }
}