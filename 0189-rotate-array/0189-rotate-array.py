class Solution:
    def reverse(self, nums: List[int], left, right):

        while(left < right):
            temp = nums[left]
            nums[left] = nums[right]
            nums[right] = temp

            left += 1
            right -= 1



    def rotate(self, nums: List[int], k: int) -> None:
        
        n = len(nums)
        k = k % n

        while(k < 0):
            k += n

        self.reverse(nums, 0, n-k-1)
        self.reverse(nums, n-k, n-1)
        self.reverse(nums, 0, n-1)
        
        