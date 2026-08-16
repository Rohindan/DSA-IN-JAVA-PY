class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int b = 0;
        for(int i = 0; i < nums.length; i++){
            b += nums[i];
        }
        
        int a = 0;
        for(int i = 1; i <= nums.length; i++){
            a += i;
        }
         
        int total = a - b;
        return total; 

    }
}