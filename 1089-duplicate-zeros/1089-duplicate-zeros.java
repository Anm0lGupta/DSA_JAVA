class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] != 0)
            {
                list.add(arr[i]);
            }
            if(arr[i] == 0)
            {
                list.add(0);
                list.add(arr[i]);
            }
        }
        for(int j=0; j<arr.length; j++)
        {
            arr[j] = list.get(j);
        }
    }
}