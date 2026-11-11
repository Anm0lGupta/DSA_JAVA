class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int t : time) {
            mp.put(t, mp.getOrDefault(t, 0) + 1);
        }
        int ans = 0;
        for (int t : time) {
            mp.put(t, mp.get(t) - 1);

            if (mp.get(t) == 0) {
                mp.remove(t);
            }
            int rem = (60 - (t % 60)) % 60;

            if (rem == 0) {
                rem = 60;
            }
            for (int j = rem; j <= 500; j += 60) {
                ans += mp.getOrDefault(j, 0);
            }
        }

        return ans;
    }
}