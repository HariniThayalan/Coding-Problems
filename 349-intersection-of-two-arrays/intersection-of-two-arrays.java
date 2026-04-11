class Solution 
{
    public int[] intersection(int[] n1, int[] n2) 
    {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n1.length;i++)
        {
            for(int j=0;j<n2.length;j++)
            {
                if(n1[i]==n2[j]&&!l.contains(n1[i]))
                {
                    l.add(n1[i]);
                }
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