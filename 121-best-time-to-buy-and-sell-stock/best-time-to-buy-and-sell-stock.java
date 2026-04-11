class Solution {
    public int maxProfit(int[] p) {
        int b=p[0];
        int pr=0;
        for(int i=0;i<p.length;i++)
        {
            if(b>p[i])
            {
               b=p[i];
            }
            else if(p[i]-b>pr)
            {
               pr=p[i]-b;
            }         
        }   
        return pr;   
    }
}