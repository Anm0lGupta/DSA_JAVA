class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(char C : word.toCharArray())
        {
            freq[C-'a']++;
        }
        Arrays.sort(freq);
        int pushCounter = 0;
        for(int i=25; i>=0; i--)
        {
            if(freq[i] != 0)
            {
                if(i>=18) pushCounter+=freq[i]*1;
                else if(i>=10 && i<=17) pushCounter+=freq[i]*2;
                else if(i>=2 && i<=9) pushCounter+=freq[i]*3;
                else if(i<=1) pushCounter+=freq[i]*4;
            }
            else
            {
                break;
            }
        }
        return pushCounter;
    }
}