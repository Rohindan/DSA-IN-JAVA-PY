class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        if(word1 == null){
            return word2;
        }
        if(word2 == null){
            return word1;
        }
        
        String result = "";
        int i = 0;
        while(i < word1.length() && i < word2.length()){
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);
            result += ch1;
            result += ch2;

            i++;
        }

        if(word1.length() == i){
            for(int j = i; j < word2.length(); j++){
                result += word2.charAt(j);
            }
        }
        if(word2.length() == i){
            for(int j = i; j < word1.length(); j++){
                result += word1.charAt(j);
            }
        }

        return result;
    }
}