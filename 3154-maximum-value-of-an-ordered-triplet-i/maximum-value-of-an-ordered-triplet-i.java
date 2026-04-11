class Solution {
    public long maximumTripletValue(int[] nums) 
    {
        long ni=0,nj=0,nk=0;
        for(int n:nums)
        {
            if(n>0)
            {
                nk=Math.max(nk,nj*n);
                nj=Math.max(nj,ni-n);
                ni=Math.max(ni,n);
            }
            else
            {
                return 0;
            }
        }
        return nk;
    }
}