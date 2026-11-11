class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        int max = 0;
        for(int nu : nums)
        {
            int n = nu;
            int temp = 1;
            while(set.contains(--n))
            {
                temp++;
                set.remove(n);
            }
            n = nu;
            while(set.contains(++n))
            {
                temp++;
                set.remove(n);
            }
            max = Math.max(max, temp);
        }
        return max;
    }
}