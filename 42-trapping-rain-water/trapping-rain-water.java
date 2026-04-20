class Solution 
{
    public int trap(int[] height) 
    {
        int l=0,r=height.length-1;
        int t=0;
        int l1=height[l],r1=height[r];
        while(l<r)
        {
            if(l1<r1)
            {
                l++;
                l1=Math.max(l1,height[l]);
                t+=l1-height[l];
            }
            else
            {
                r--;
                r1=Math.max(r1,height[r]);
                t+=r1-height[r];
            }
        }
        return t;
    }   
}