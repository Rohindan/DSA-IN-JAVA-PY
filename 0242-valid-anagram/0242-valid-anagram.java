class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);

        }

        if(s.length() != t.length()){
            return false;
        }


        for(int i = 0; i < t.length(); i++){
            char ch2 = t.charAt(i);
            if(!map.containsKey(ch2) || map.get(ch2) == 0){
                return false;
            }
            map.put(ch2,map.get(ch2) -1 );
            
        }

        return true;
        



    }
}