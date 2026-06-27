class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int num:candyType)
        {
            if(!set.contains(num))
            {
                set.add(num);
                count++;
            }
        }
        int n = candyType.length/2;
        if(count>=n)
        {
            return n;
        }
        return count;
    }
}