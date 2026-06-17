class Solution 
{
    public int[][] mergeArrays(int[][] nums1, int[][] nums2)
    {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] item : nums1) 
        {
            map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }
        for (int[] item : nums2) 
        {
            map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }
        int[][] result = new int[map.size()][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            result[index][0] = entry.getKey();  
            result[index][1] = entry.getValue(); 
            index++;
        }
        return result;
    }
}