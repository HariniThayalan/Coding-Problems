class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        boolean f=false;
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        { 
            if(s.contains(nums[i]))
            {
                f=true;
            }
            s.add(nums[i]);
        }
        return f;  
    }
}