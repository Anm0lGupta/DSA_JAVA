class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(nums1.length > i && nums2.length > j)
        {
            if(nums1[i] == nums2[j])
            {
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j])
            {
                j++;
            }
            else
            {
                i++;
            }
        }
        int[] result = new int[list.size()];
        for(int k=0; k<list.size(); k++)
        {
            result[k] = list.get(k);
        }
        return result;
    }
}