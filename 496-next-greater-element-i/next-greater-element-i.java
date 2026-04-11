class Solution 
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        HashMap<Integer,Integer> m=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<nums2.length;i++)
        {
            while(!s.isEmpty() && s.peek()<nums2[i])
            {
                m.put(s.pop(),nums2[i]);
            }
            s.push(nums2[i]);
        }
        while(!s.isEmpty())
        {
            m.put(s.pop(),-1);
        }
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            res[i]=m.get(nums1[i]);
        }
        return res;
    }
}