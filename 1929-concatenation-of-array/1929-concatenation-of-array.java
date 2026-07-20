class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0;i<2*n;i++){
            if(i >= n){
                ans[i] = nums[i-n];
            }
            else if(i < n) {   //4
                ans[i] = nums[i];
            }
        }
        return ans;

        
    }
}