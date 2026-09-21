class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 1;
        int k = 1;
        while(fast < nums.length){
            if(nums[slow] == nums[fast]){
                fast++;
            
            }
            else{
                slow++;
                k++;
                nums[slow] = nums[fast];
            }
        }

        return k;
    }
}