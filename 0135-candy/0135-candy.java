class Solution {
    public int candy(int[] ratings) {
        int[] arr = new int[ratings.length];
        int i = 1;
        while(i<ratings.length)
        {
            if(ratings[i]>ratings[i-1])
            {
                if(arr[i]<=arr[i-1])
                {
                    arr[i]= arr[i-1] + 1;
                }
            }
            i++;
        }
        int j = ratings.length-2;
        while(j>=0)
        {
            if(ratings[j]>ratings[j+1])
            {
                if(arr[j]<=arr[j+1])
                {
                    arr[j] = arr[j+1] + 1;
                }
            }
            j--;
        }
        int sum = 0;
        for(int k=0; k<arr.length; k++)
        {
            sum = sum + arr[k];
        }
        int candy = sum + arr.length;
        return candy;
    }
}