class Solution:
    def moveZeroes(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        fast = 0
        slow = 0

        while fast < len(nums):
            if nums[fast] == 0:
                fast += 1
            else:
                temp = nums[fast]
                nums[fast] = nums[slow]
                nums[slow] = temp

                fast += 1
                slow += 1
        
        return nums