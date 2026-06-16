class Solution 
{
    public int[] arrayRankTransform(int[] arr) 
    {
        Map<Integer,Integer> map=new TreeMap<>();
        for(int a:arr)
        {
            map.put(a,0);
        }
        int in=1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            map.put(entry.getKey(),in++);
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}