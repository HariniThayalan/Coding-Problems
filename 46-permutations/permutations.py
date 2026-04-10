class Solution:
    def permute(self, nums):
        if len(nums) == 1:
            return [nums]
        result = []
        for i in range(len(nums)):
            others = nums[:i] + nums[i+1:]
            other_permutations = self.permute(others)
            for j in other_permutations:
                result.append([nums[i]] + j)
        return result
s=Solution()
input=[1,2,3]
o=s.permute(input)
print(o)