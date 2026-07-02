class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nums = new int[n1 + n2];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i<n1 && j<n2)
        {
            if(nums1[i] < nums2[j])
            {
                nums[index] = nums1[i];
                index++;
                i++;
            }
            else
            {
                nums[index] = nums2[j];
                index++;
                j++;
            }
        }
        while(i<n1)
        {
            nums[index] = nums1[i];
            index++;
            i++; 
        }
        while(j<n2)
        {
            nums[index] = nums2[j];
            index++;
            j++; 
        }
        double median = 0;
        if(nums.length%2==0)
        {
            median = ((nums[nums.length/2-1] + nums[(nums.length/2)])/2.0);
        }
        else
        {
            median = (nums[nums.length/2]);
        }
        return median;
    }
}