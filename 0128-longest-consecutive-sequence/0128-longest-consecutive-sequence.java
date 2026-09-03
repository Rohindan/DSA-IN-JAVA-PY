class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer , Boolean> map = new HashMap<>();

        for(int val : nums){
            map.put(val , true);
        }

        for(int val : nums){
            if(map.containsKey(val - 1)){
                map.put(val , false);
            }
        }

        int ml = 0;
        for(int val : map.keySet()){
            if(map.get(val) == true){
                int tl = 1;
                int tsl = val;

                while(map.containsKey(tsl + tl)){
                    tl++;
                }

            if(tl > ml){
                ml = tl;
            }
                
            }
        }

        return ml;

    }
}