class Solution 
{
    public int[][] generateMatrix(int n) 
    {
        int top=0,left=0,bottom=n-1,right=n-1;
        int[][] spiral=new int[n][n];
        int v=1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                spiral[top][i]=v++;
            }
            top++;
            for(int j=top;j<=bottom;j++)
            {
                spiral[j][right]=v++;
            }
            right--;
            if (top<=bottom) 
            {
                for (int k=right;k>=left;k--)
                {
                    spiral[bottom][k]=v++;
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int l=bottom;l>=top;l--)
                {
                    spiral[l][left]=v++;
                }
                left++;
            }
        }
        return spiral;
    }
}