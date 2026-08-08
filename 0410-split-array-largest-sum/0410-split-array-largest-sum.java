class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        if(k > n) return -1; 
        int low = 0;
        int high = 0;
        for(int num : nums) {
            high += num;
            low = Math.max(low, num);
        }
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int studentCount = 1;
            int pagesCount = 0; 
            for(int num : nums) {
                if(pagesCount + num <= mid) {
                    pagesCount += num;
                } else {
                    studentCount++;
                    pagesCount = num;
                }
            } 
            if(studentCount > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return low;
    }
}