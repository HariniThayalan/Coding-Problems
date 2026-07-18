class Solution 
{
    public char findTheDifference(String s, String t)
    {
        int sum=0,diff=0;
        for(char ch: t.toCharArray())
        {
            sum+=ch-'a';
        }
        for(char ch: s.toCharArray())
        {
            diff+=ch-'a';
        }
        return(char) (sum-diff+'a');
    }
}