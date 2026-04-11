class Solution 
{
    public int[] intersect(int[] n1, int[] n2) 
    {
        ArrayList<Integer> l=new ArrayList<>();
        Arrays.sort(n1);
        Arrays.sort(n2);
        int i=0,j=0;
        while(i<n1.length&&j<n2.length)
        {
            if(n1[i]==n2[j])
            {
                l.add(n1[i]);
                i++;
                j++;
            }
            else if(n1[i]<n2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        int[] a=new int[l.size()];
        for(int k=0;k<l.size();k++)
        {
            a[k]=l.get(k);
        }
        return a;
    }
}