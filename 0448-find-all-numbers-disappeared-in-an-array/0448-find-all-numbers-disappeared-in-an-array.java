class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        int n = nums.length;
        
        while (i < n) {
            int correctIdx = nums[i] - 1;
            
            if (nums[i] != nums[correctIdx]) {
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            } else {
                i++;
            }
        }
        
        List<Integer> missingNumbers = new ArrayList<>();
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                missingNumbers.add(i + 1);
            }
        }
        
        return missingNumbers;        
    }
}