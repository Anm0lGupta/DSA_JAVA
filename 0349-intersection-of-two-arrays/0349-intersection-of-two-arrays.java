class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] num = new int[Math.min(nums1.length, nums2.length)];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        int index = 0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i] == nums2[j])
            {
                if(index == 0 || num[index - 1] != nums1[i])
                {
                    num[index] = nums1[i];
                    index++;
                }
                i++;
                j++;

            }
            else if(nums1[i] < nums2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        return Arrays.copyOfRange(num, 0, index);
    }
}