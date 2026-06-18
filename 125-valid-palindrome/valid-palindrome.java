class Solution {
    public boolean isPalindrome(String s) 
    {
        String n = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int p1 = 0;
        int p2 = n.length() - 1;
        while(p2 >= p1)
        {
            if(n.charAt(p1) != n.charAt(p2)) 
                return false;
            p1++;
            p2--;
        }
        return true;
    }
}