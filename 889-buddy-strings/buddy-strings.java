class Solution 
{
    public boolean buddyStrings(String s, String goal) 
    {
        if(s.length() != goal.length()) 
            return false;
        if(s.equals(goal))
        {
            HashSet<Character> set = new HashSet<>();
            for(char ch : s.toCharArray())
            {
                if(set.contains(ch))
                {
                    return true;
                }
                set.add(ch);
            }
            return false;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != goal.charAt(i))
            {
                list.add(i);
            }
        }
        if(list.size() != 2)
        {
            return false;
        }
        int i = list.get(0);
        int j = list.get(1);
        if(s.charAt(i) == goal.charAt(j) && s.charAt(j) == goal.charAt(i)) 
            return true;
        return false;
    }
}