class Solution {
    public String longestCommonPrefix(String[] strs) {
        // firstly check if string array is empty or not ma boii
        if(strs == null || strs.length == 0)
        {
            return "";
        }
        //now last do the sorting ma boii
        Arrays.sort(strs); // oh yeaa
        String first = strs[0]; // first string
        String last = strs[strs.length - 1];
        while(first.indexOf(last) != 0)
        {
            last = last.substring(0, last.length() -1);
            if(last.isEmpty())
            {
                return "";
            }
        }
        return last;
    }
}