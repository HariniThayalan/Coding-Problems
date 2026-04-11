class Solution 
{
    public String longestPalindrome(String s) 
    {
        int st=0,e=0;
        if(s.length()==0||s==null)
        {
            return "";
        }
        for(int i=0;i<s.length();i++)
        {
            int odd=expand(s,i,i);
            int even=expand(s,i,i+1);
            int m=Math.max(odd,even);
            if(m>e-st)
            {
                st=i-(m-1)/2;
                e=i+(m/2);
            }
        }
        return s.substring(st,e+1);
    }
    private int expand(String s,int l,int r)
    {
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
        }
        return r-l-1;
    }
}