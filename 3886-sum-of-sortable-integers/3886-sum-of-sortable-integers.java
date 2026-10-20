class Solution {
    public int sortableIntegers(int[] nums) {
        // n ke ander arrey ki length store kardi
        int n = nums.length;
        // humne isme list banadi jisme sare divisors hai
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++)
        {
            if(n%i==0) list.add(i);
        }
        int sum = 0;
        if(isSorted(nums))
        {
            for(int num : list)
            {
                sum+=num;
            }
            return sum;
        }
        // now bs unsorted array k liye karna hai
        for(int k : list)
        {
            if(isValid(nums, k))
            {
                sum+=k;
            }
        }
        return sum;
    }
    public static boolean isSorted(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            if (array[i] > array[i + 1])
            {
                return false;
            }
        }
        return true; 
    }
    public static boolean isValid(int[] Array, int k)
    {
        int n = Array.length;
        int prev_block_ka_max = -1;
        for(int i=0; i<n; i+=k)
        {
            int block_min = Array[i];
            int block_max = Array[i];
            int drop = 0;
        
        for(int j=i; j<i+k-1; j++)
        {
            block_min = Math.min(block_min, Array[j+1]);
            block_max = Math.max(block_max, Array[j+1]);
            if(Array[j]>Array[j+1])
            {
                drop++;
            }
        }
        if(block_min < prev_block_ka_max)
        {
            return false;
        }
        if(drop > 1 || (drop==1 && Array[i+k-1]>Array[i]))
        {
            return false;
        }
        prev_block_ka_max = block_max;
        }
        return true;
    }
}