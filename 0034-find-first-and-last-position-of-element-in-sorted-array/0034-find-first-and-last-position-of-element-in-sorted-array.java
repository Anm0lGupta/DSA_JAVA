class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = search(nums, target, true);
        result[1] = search(nums, target, false);
        return result;
    }
    private static int search(int[] num, int target, boolean check)
    {
        int i=0;
        int j=num.length-1;
        int val = -1;
        while(i<=j)
        {
            int mid = i + (j-i)/2;
            if(target == num[mid])
            {
                val = mid;
                if(check)
                {
                    j=mid-1;
                }
                else
                {
                    i=mid+1;
                }
            }
            if(target > num[mid])
            {
                i = mid+1;
            }
            else if(target<num[mid])
            {
                j=mid-1;
            }
        }
        return val;
    }
}