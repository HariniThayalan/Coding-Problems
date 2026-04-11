class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
           m.put(ch,m.getOrDefault(ch,0)+1);
           if(m.get(ch)%2==0)
           {
            c--;
           }
           else
           {
            c++;
           }
        }
        if(c>1)
        {
            return s.length()-c+1;
        }
        return s.length();
    }
}