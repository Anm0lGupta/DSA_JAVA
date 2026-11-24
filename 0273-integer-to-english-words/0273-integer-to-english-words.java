class Solution {
    private final String[] below20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] below100 = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    private String help(int num)
    {
        String sb = new String();
        if(num<20)
        {
            sb = below20[num];
        }
        else if(num<100)
        {
            sb = below100[num/10] + " " + help(num%10);
        }
        else if(num<1000)
        {
            sb = help(num/100) + " Hundred " + help(num%100);
        }
        else if(num<1000000)
        {
            sb = help(num/1000) + " Thousand " + help(num%1000);
        }
        else if(num<1000000000)
        {
            sb = help(num/1000000) + " Million " + help(num%1000000);
        }
        else
        {
            sb = help(num/1000000000) + " Billion " + help(num%1000000000);
        }
        return sb.trim();
    }
    public String numberToWords(int num) {
        if(num == 0)
        {
            return "Zero";
        }
        return help(num);
    }
}