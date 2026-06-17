class Solution 
{
    public String reverseWords(String s) 
    {
        String[] words=s.split(" ");
        StringBuilder res=new StringBuilder();
        for(String w:words)
        {
            StringBuilder sb=new StringBuilder(w);
            res.append(sb.reverse().toString()).append(" ");
        }
        return res.toString().trim();
    }
}