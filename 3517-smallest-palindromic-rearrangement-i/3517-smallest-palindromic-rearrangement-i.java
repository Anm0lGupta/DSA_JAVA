class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray())
        {
            freq[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        String middle = "";
        for(int i=0; i<26; i++)
        {
            if(freq[i]%2 != 0)
            {
                middle = String.valueOf((char) (i + 'a'));
            }
           for(int j=0; j<freq[i]/2; j++)
           {
                sb.append((char) (i+'a'));
           }
        }
        return sb.toString() + middle + sb.reverse().toString();
    }
}