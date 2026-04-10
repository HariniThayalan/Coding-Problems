class Solution:
    def permuteUnique(self, nums):
        if len(nums) == 1:
            return [nums]
        result = []
        visited = set()
        for i in range(len(nums)):
            if nums[i] not in visited:
                visited.add(nums[i])
                o = nums[:i] + nums[i+1:]
                op = self.permuteUnique(o)
                for j in op:
                    result.append([nums[i]] + j)
        return result
s = Solution()
i = [1, 1, 2]
r = s.permuteUnique(i)
print(r)