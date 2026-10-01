class Solution {
    public boolean isValid(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int[] arr = new int[s.length()];
        int index = -1;
        int count = 0;
        mp.put('(', 1);
        mp.put(')', -1);
        mp.put('{', 2);
        mp.put('}', -2);
        mp.put('[', 3);
        mp.put(']', -3);
        for(int i=0; i<s.length(); i++)
        {
            int val = mp.get(s.charAt(i));
            if(val>0)
            {
                index++;
                arr[index] = val;
            }
            else
            {
                if(index==-1 || arr[index] != -val)
                {
                    return false;
                }
                index--;
            }
        }
        return index == -1;
    }
}