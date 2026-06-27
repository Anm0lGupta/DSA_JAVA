class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas = 0;
        for(int num:gas)
        {
            sumGas = sumGas + num;
        }
        int sumCost = 0;
        for(int num:cost)
        {
            sumCost = sumCost + num;
        }
        if(sumGas<sumCost)
        {
            return -1;
        }
            int index = 0;
            int temp = 0;
            for(int i=0; i<gas.length; i++)
            {
                temp = (gas[i] + temp) - cost[i];
                
                if(temp<0)
                {
                    index = i + 1;
                    temp = 0;
                }
            }
            return index;
    }
}