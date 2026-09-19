class Solution {
        private int helper(int val, int min, int max)
        {
            return Math.max(min, Math.min(val, max));
        }
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closeX = helper(xCenter, x1, x2);
        int closeY = helper(yCenter, y1, y2);
        int disX = closeX-xCenter;
        int disY = closeY-yCenter;
        return (disX*disX) + (disY*disY) <= (radius*radius); 
    }
}