class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int i = 0;
        int count = 0;
        for(int req : requests)
            {
                count += Math.abs(req-i);
                i = req;
            }
        return count;
    }
}