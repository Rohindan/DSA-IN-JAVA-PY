class Solution {
    public void moveZeroes(int[] nums) {
        
        int fast = 0;
        int slow = 0;
        
        while(fast < nums.length){
            if(nums[fast] == 0){
                fast++;
            }
            else{
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
                fast++;
            }
        }

    }
}