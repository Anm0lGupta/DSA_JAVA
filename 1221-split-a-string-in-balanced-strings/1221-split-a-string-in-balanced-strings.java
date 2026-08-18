class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int maxSplits = 0;
        
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'R') {
                balance++;
            } else {
                balance--;
            }
            
            if (balance == 0) {
                maxSplits++;
            }
        }
        
        return maxSplits;
    }
}