class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder ss = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if((Character.isLetterOrDigit(ch))){

                ss.append(Character.toLowerCase(ch));
            }
        }

        int i = 0;
        int j = ss.length()-1;
        while(i <= j){
            char ch1 = ss.charAt(i);
            char ch2 = ss.charAt(j);
            if(ch1 != ch2){
                return false;
            }
            else{
                i++;
                j--;
            }
        }

        

        return true;

    }
}