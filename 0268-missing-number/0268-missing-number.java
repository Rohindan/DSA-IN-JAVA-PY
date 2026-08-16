class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int a = 0;
        for(int i = 0; i < nums.length; i++){
            a += nums[i];
        }
        
        int b = n*(n+1)/2;
         
        int total = b - a;
        return total; 

    }
}