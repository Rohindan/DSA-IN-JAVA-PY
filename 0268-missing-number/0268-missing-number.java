class Solution {
    public int missingNumber(int[] nums) {
        int a = 0;
        for(int i = 0; i < nums.length; i++){
            a += nums[i];
        }
        
        int b = 0;
        for(int i = 1; i <= nums.length; i++){
            b += i;
        }
         
        int total = b - a;
        return total; 

    }
}