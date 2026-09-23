class Solution {
    public int removeElement(int[] nums, int val) {

        int slow = 0;
        int fast = 0;
        int count = 0;
        while(fast < nums.length){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                fast++;
                slow++;
                count++;
            }
            else{
                fast++;
            }
        
        }

        return count;
        
    }
}