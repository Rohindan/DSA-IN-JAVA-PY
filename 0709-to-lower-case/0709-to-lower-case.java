class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++){
            char ch = sb.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                char lch = (char) ('a' + ch - 'A');
                sb.setCharAt(i,lch);
            }
        }
        return sb.toString();
    }
}