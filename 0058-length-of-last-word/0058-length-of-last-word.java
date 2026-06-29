class Solution {
    public int lengthOfLastWord(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        String trim = reverse.trim().split("\\s+")[0];
        return trim.length();
    }
}