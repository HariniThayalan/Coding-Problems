class Solution
{
    public long maximumTripletValue(int[] A) 
    {
        long k = 0;
        long i = 0;
        long j = 0;
        for (int a : A) 
        {
            k = Math.max(k, j * a);
            j = Math.max(j, i - a);
            i = Math.max(i, a);
        }
        return k;
    }
}