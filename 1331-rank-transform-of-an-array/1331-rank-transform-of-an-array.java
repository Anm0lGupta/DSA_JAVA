class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] A = arr.clone();
        Arrays.sort(A);
        Map<Integer, Integer> mp = new HashMap<>();
        int count = 1;
        for(int num : A)
        {
            boolean check = mp.containsKey(num);
            if(!check)
            {
                mp.put(num, count);
                count++;
            }
            else
            {
                continue;
            }
        }
        for(int i=0; i<A.length; i++)
        {
            A[i] = mp.get(arr[i]);
        }
        return A;
    }
}