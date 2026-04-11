class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        int[] c=new int[256];
        if (s.length() != t.length()) 
            return false;
        for(int i=0;i<s.length();i++)
        {
            c[s.charAt(i)]++;
            c[t.charAt(i)]--;
        }
        for (int count : c) 
        {
            if (count != 0) 
                return false;
        }
        return true;
    }
}