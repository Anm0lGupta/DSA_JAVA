class Solution {
    public int numberOfSteps(int num)
    {
        return func(num, 0);
    }
    static int func(int num, int steps)
    {
        if(num==0) return steps;
        if(num%2==0)
        {
            return func(num/2, ++steps);
        }
        return func(--num, ++steps);
    }
}