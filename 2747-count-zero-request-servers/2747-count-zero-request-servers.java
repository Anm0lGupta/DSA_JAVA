class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        int[] ans = new int[queries.length];

        HashMap<Integer,Integer> h = new HashMap<>();

        Arrays.sort(logs, (a,b)->{
            // sorting based on time
            return a[1] - b[1];
        });

        // System.out.println(Arrays.deepToString(logs));

        int j = 0, k = 0;
        
        // save sorted queries alog with indices
        int[][] dp = new int[queries.length][2];
        for (int  i = 0; i < queries.length; i++) {
            dp[i][0] = i;
            dp[i][1] = queries[i];
        }
        
        Arrays.sort(dp, (a,b)->{
            return a[1]-b[1];
        });

        for (int  i = 0; i < dp.length; i++) {
            int start = dp[i][1] - x;
            int end = dp[i][1];

            
            while (j < logs.length && logs[j][1] < start) {
                
                
                if(!h.isEmpty()) {
                    h.put(logs[j][0], h.get(logs[j][0])-1);
                    if (h.get(logs[j][0])==0) h.remove(logs[j][0]);
                }
                j++;
            }
            
            k = Math.max(j, k);
            
            while (k < logs.length && logs[k][1] <= end) {
                h.put(logs[k][0], h.getOrDefault(logs[k][0], 0)+1);
                k++;
            }
            ans[dp[i][0]] = n - h.size();
        }
        return ans;
    }
}