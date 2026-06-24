class Solution {
    private final int MOD = 1000000007;

    public int zigZagArrays(int n, int l, int r) {
        int K = r - l + 1;
        
        long[][] T = new long[K][K];
        for (int v = 0; v < K; v++) {
            for (int w = K - v; w < K; w++) {
                T[v][w] = 1;
            }
        }
        
        long[][] tPow = power(T, n - 2, K);
        
        long[] X2 = new long[K];
        for (int i = 0; i < K; i++) {
            X2[i] = i;
        }
        
        long[] Xn = new long[K];
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < K; j++) {
                Xn[i] = (Xn[i] + tPow[i][j] * X2[j]) % MOD;
            }
        }
        
        long totalValid = 0;
        for (int i = 0; i < K; i++) {
            totalValid = (totalValid + Xn[i]) % MOD;
        }
        
        totalValid = (totalValid * 2) % MOD;
        
        return (int) totalValid;
    }

    private long[][] multiply(long[][] A, long[][] B, int K) {
        long[][] C = new long[K][K];
        for (int i = 0; i < K; i++) {
            for (int k = 0; k < K; k++) {
                if (A[i][k] != 0) { 
                    for (int j = 0; j < K; j++) {
                        C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % MOD;
                    }
                }
            }
        }
        return C;
    }

    private long[][] power(long[][] A, int p, int K) {
        long[][] res = new long[K][K];
        
        for (int i = 0; i < K; i++) {
            res[i][i] = 1;
        }
        
        long[][] base = A;
        while (p > 0) {
            if (p % 2 == 1) {
                res = multiply(res, base, K);
            }
            base = multiply(base, base, K);
            p /= 2;
        }
        
        return res;
    }
}