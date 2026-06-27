class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        int n = candyType.length/2;
        for(int num:candyType)
        {
            set.add(num);
        if(set.size() == n)
        {
            return n;
        }
    }
        return set.size();
    }
}