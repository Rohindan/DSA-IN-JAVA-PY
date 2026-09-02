class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int val : nums1){
            map.put(val , map.getOrDefault(val,0) + 1);
        }

        int[] arr = new int[nums1.length < nums2.length? nums1.length : nums2.length];
        int index = 0;

        for(int val : nums2){
            if(map.containsKey(val)){
                arr[index] = val;
                index++;
            }
            map.remove(val);
        }

        return Arrays.copyOf(arr,index);

    }
}