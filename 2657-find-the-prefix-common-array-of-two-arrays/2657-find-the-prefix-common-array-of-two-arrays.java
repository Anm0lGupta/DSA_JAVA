class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] freq = new int[A.length+1];
        int[] C = new int[A.length];
        for(int num : A)
        {
            freq[num] = 2;
        }
        int common=0;
        for(int i=0; i<A.length; i++)
        {
            freq[A[i]]--;
            if (freq[A[i]] == 0) {
                common++; 
            }
            freq[B[i]]--;
            if (freq[B[i]] == 0) {
                common++;
            }
            C[i] = common;
        }
        return C;
    }
}