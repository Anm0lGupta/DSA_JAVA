class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int occurence = s.length() - s.replace("1", "").length();
        if(occurence < k) return "";
        char[] nums = s.toCharArray();
        int i=0;
        int count = 0;
        String l = "";
        for(int j=0; j<nums.length; j++)
        {
            if(nums[j] == '1') count++;
            while(count == k)
            {
                if(nums[i] == '0') 
                {
                    i++;
                    continue;
                }
                String currentString = s.substring(i, j+1);
                if(l.isEmpty() || currentString.length() < l.length() || currentString.length() == l.length() && currentString.compareTo(l)<0) 
                {
                    l = currentString;
                }
                count--;
                i++;
            }
        }
        return l;
    }
}