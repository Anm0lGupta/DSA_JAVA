class Solution {
    public String reversePrefix(String s, int k) {
        String str = s.substring(0, k);
        String str1 = s.substring(k);
        String rev = new StringBuilder(str).reverse().toString();
        return rev+str1;
    }
}