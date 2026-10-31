class Solution {
    public int calculateScore(int a, int b) {
        int s1 = Integer.bitCount(a);
        int s2 = Integer.bitCount(b);

        
        int result = 0;
        if(s1 >= s2){
            result =  s1 * s2;
        }
        else{
            result = (int) s2 / s1;
        }

        return result;

    }
}