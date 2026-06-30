class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        String palindrome = lower.replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = palindrome.length()-1;
        while(i<j)
        {
            if(palindrome.charAt(i) == palindrome.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}