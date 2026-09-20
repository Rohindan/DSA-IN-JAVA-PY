class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder ss = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){

                ss.append(Character.toLowerCase(ch));
            }
        }

        int left = 0;
        int right = ss.length()-1;
        while(left < right){
            char ch1 = ss.charAt(left);
            char ch2 = ss.charAt(right);
            if(ch1 != ch2){
                return false;
            }
            else{
                left++;
                right--;
            }
        }

        

        return true;

    }
}