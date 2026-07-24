class Solution {
    public int maxDistinct(String s) {
        Set<Character> set = new HashSet<>();
        int c = 0;
        for(char ch : s.toCharArray())
        {
            if(!set.contains(ch))
            {
                c += 1;
            }
            set.add(ch);
        }
        return c;
    }
}