class Solution {
    public int hIndex(int[] c) {
        int h=0;
        for(int i=c.length-1; i>=0; i--)
        {
            if(c[i]>=h+1)
            {
                h++;
            }
        }
        return h;
    }
}