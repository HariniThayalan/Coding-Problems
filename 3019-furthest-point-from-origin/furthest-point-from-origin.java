class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0, r = 0, buffer = 0;
        for(char ch : moves.toCharArray())
        {
            if(ch == 'L')
                l++;
            else if(ch == 'R')
                r++;
            else
                buffer++;
        }
        return Math.max(l + buffer - r, r + buffer-l);
    }
}