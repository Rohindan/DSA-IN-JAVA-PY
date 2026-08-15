class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] arr = {1};
        int[] sum = new int[n];

        int i = digits.length-1;
        int j = arr.length-1;
        int k = sum.length-1;

        int c = 0;
        while(k >= 0){
            int d = c;

            if( i >= 0){
                d += digits[i];
            }
            if(j >= 0){
                d += arr[j];
            }

            c = d / 10;
            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;



        }
        if(c > 0){
            int[] res = new int[n+1];
            res[0] = c;
            for(int x = 0; x < n; x++){
                res[x+1] = sum[x];
            }
            return res;
        }
        
        return sum;


    }
}