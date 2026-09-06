class Solution {
    public int twoEggDrop(int n) {
        int m = 0;
        int f = 0;
        while(f<n)
        {
            m++;
            f+=m;
        }
        return m;
    }
}