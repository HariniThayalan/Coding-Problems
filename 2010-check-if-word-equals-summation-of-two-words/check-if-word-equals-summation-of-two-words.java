class Solution 
{
    public boolean isSumEqual(String f, String s, String t) 
    {
        return (getSum(f)+getSum(s)==getSum(t));
    }
    private int getSum(String s)
    {
        int v=0;
        for(int i=0;i<s.length();i++)
        {
            v=v*10+(s.charAt(i)-'a');
        }
        return v;
    }
}