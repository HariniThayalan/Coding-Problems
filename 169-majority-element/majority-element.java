class Solution 
{
    public int majorityElement(int[] nums) 
    { 
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int k=nums[0];
        int v=0;
        for(Map.Entry<Integer,Integer> e:m.entrySet())
        {
           if(v<e.getValue())
           {
            k=e.getKey();
            v=e.getValue();
           }
        }
        return k;
    }
}