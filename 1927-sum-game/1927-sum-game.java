class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        double sumDiff = 0; 
        double qDiff = 0;   
        
        for (int i = 0; i < n; i++) {
            boolean isLeft = (i < n / 2);
            char c = num.charAt(i);
            
            if (c == '?') {
                if (isLeft) qDiff++;
                else qDiff--;
            } else {
                int val = c - '0';
                if (isLeft) sumDiff += val;
                else sumDiff -= val;
            }
        }
        return sumDiff + (qDiff / 2.0) * 9.0 != 0.0;
    }
}