class Solution {
    public int searchInsert(int[] nums, int target) {
        
        //max array
        int max = nums[0];
        int n = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return n += i;
            }
            else if(target > max){
                return n += nums.length;
            }
            else if(target < nums[i]){
                return n += i;
            }
        }

        return n;




    }
}