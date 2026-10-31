class Solution {
    public int calculateScore(int a, int b) {
        int x = Integer.parseInt(Integer.toBinaryString(a));
        int y = Integer.parseInt(Integer.toBinaryString(b));

        int s1 = 0;
        int s2 = 0;
        while(x > 0){
            int d = x % 10;
            s1 += d;
            x /= 10;
        }

        while(y > 0){
            int d = y % 10;
            s2 += d;
            y /= 10;
        }

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