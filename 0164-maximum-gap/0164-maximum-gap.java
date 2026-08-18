class Solution {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        radixSort(nums);

        int max_difference = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int current_difference = nums[i + 1] - nums[i];
            if (current_difference > max_difference) {
                max_difference = current_difference;
            }
        }

        return max_difference;
    }

    private void radixSort(int[] nums) {

        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(nums, exp);
        }
    }

    private void countingSort(int[] nums, int exp) {
        int n = nums.length;
        int[] output = new int[n]; 
        int[] count = new int[10]; 

        for (int i = 0; i < n; i++) {
            int digit = (nums[i] / exp) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int digit = (nums[i] / exp) % 10;
            output[count[digit] - 1] = nums[i];
            count[digit]--;
        }

        for (int i = 0; i < n; i++) {
            nums[i] = output[i];
        }
    }
}