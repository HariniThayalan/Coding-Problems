class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs==null || strs.length==0)
        {
            return "";
        }       
        String f=strs[0];
        int l=f.length();
        for(int i=1;i<strs.length;i++)
        {
            String s=strs[i];
            while(l>s.length() || !f.equals(s.substring(0,l)))
            {
                l--;
                if(l==0)
                {
                    return "";
                }
                f=f.substring(0,l);
            }
        }
        return f;
    }
}