import java.util.HashMap;

class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        int freq1 = map.getOrDefault(0, 0);
        int freq2 = map.getOrDefault(1, 0);
        int freq3 = map.getOrDefault(2, 0);
        int j=0;
        for(int i=0; i<freq1; i++){
            nums[j++] = 0;
        }
        for(int i=0; i<freq2; i++){
            nums[j++] = 1;
        }
        for(int i=0; i<freq3; i++){
            nums[j++] = 2;
        }
    }
}