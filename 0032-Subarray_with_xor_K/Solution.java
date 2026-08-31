import java.util.HashMap;

class Solution {
    public int subarraysWithXorK(int[] nums, int k) {
       HashMap<Integer, Integer> map = new HashMap<>();

        int xor = 0;
        int count = 0;

        map.put(0, 1);

        for (int i = 0; i < nums.length; i++){
            xor = xor ^ nums[i];

            int prevXor = xor ^ k;

            if (map.containsKey(prevXor)){
                count += map.get(prevXor);
            }

            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }

        return count;
    }
}