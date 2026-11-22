class Solution {
    public boolean checkString(String s) {
        int a = 0;
        int b = 0;
        char[] ch = s.toCharArray();
        for(char c : ch)
        {
            if(c == 'b')
            {
                b++;
            }
            if(c == 'a' && b != 0)
            {
                return false;
            }
        }
        return true;
    }
}