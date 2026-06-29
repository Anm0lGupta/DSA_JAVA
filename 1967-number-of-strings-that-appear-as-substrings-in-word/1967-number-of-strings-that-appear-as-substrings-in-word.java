class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String pattern : patterns)
        {
            boolean val = word.contains(pattern);
            if(val == true)
            {
                count++;
            }
        }
        return count;
    }
}