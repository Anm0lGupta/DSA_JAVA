class Solution {
    public int romanToInt(String s) {
        int totalvalue = 0;
        int l = s.length();
        for(int i=0; i<l;i++)
        {
            int curr = romanValue(s.charAt(i));
            if(i< l-1 && curr < romanValue(s.charAt(i+1)))
            {
                totalvalue -= curr;
            }
            else
            {
                totalvalue += curr;
            }

        }
        return totalvalue;
    }
    private int romanValue(char ch)
    {
        switch(ch)
        {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}