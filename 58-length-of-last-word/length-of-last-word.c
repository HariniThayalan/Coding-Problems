int lengthOfLastWord(char* s) 
{
    int i,c=0;
    for(i=strlen(s)-1;i>=0;i--)
    {
        if(s[i]!=' ')
        {
            c++;
        }
        else if(c>0)
        {
            break;
        }
    }
    return c;
}