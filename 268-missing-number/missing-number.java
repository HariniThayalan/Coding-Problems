class Solution {
    public int missingNumber(int[] nums) {
        int s=0,n=nums.length;
        int a=n*(n+1)/2;
        for(int m:nums)
        {
            s+=m;
        }
        return a-s;
    }
}