int strStr(char* haystack, char* needle) 
{
    int h=strlen(haystack);
    int n=strlen(needle);
    if(h<n)
    {
        return -1;
    }
    for(int i=0;i<h;i++)
    {
        int j;
        for(j=0;j<n;j++)
        {
            if(haystack[i+j]!=needle[j])
            {
                break;
            }
        }
        if(n==j)
        {
            return i;
        }
    }  
    return -1;
}
