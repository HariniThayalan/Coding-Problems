class Solution(object):
    def searchInsert(self, nums, target):
        i,j=0,len(nums)
        while i<j:
            m=(i+j)/2
            if nums[m]==target:
                return m
            elif(nums[m]>target):
                j=j-1
            elif(nums[m]<target):
                i=i+1
        return i