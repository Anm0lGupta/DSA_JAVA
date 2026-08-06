class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n; i<Integer.MAX_VALUE; i++)
        {
            if(prod(i)%t==0) return i;
        }
        return -1;
    }
        static int prod(int n)
    {
        if(n<10) return n;
        int digit = n%10;
        n=n/10;
        return prod(n)*digit;
    }
}