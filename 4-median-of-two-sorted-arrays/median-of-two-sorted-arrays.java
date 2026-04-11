class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        List<Integer> l=new ArrayList<>();
        for(int i:nums1)
        {
            l.add(i);
        }
        for(int i:nums2)
        {
            l.add(i);
        }
        Collections.sort(l);
        int s=l.size();
        if(s%2==0)
        {
            return (l.get(s / 2) + l.get((s / 2) - 1)) / 2.0;
        }
        else
        {
            return l.get(s/2);
        }
    }
}