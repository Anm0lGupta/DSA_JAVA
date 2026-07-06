class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int result = 0;
        
        for (int num : nums) {
            if (set.contains(num)) {
               
                result ^= num; 
            } else {
              
                set.add(num);
            }
        }
        
        return result;
    }
}