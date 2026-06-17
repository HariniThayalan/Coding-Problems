class Solution 
{
    public String frequencySort(String s) 
    {
        Map<Character,Integer> m = new HashMap<>();
        for(char c : s.toCharArray())
        {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(m.entrySet());
        entryList.sort((e1, e2) -> e2.getValue() - e1.getValue());
        char[] result = new char[s.length()];
        int index = 0;
        for(Map.Entry<Character,Integer> e : entryList)
        {
            char ch = e.getKey();
            int frequency = e.getValue();
            for(int i = 0; i < frequency; i++) 
            {
                result[index++] = ch;
            }
        }
        return new String(result);
    }
}