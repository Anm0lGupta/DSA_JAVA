class Solution {
    public String shortestPalindrome(String s) {
       /* StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            sb.append(ch);
        }
        String rev = sb.reverse().toString(); */
        String rev = new StringBuilder(s).reverse().toString();
        for(int i=0; i<s.length(); i++)
        {
            if(s.substring(0, s.length()-i).equals(rev.substring(i)))
            {
                return rev.substring(0, i) + s;
            }
        }
        return rev + s;
    }
}