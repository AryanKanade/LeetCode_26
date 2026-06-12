import java.util.*;

public class Solution {
    public static void main (String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] nums = {4, 4, 5, 5, 6};
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        int maxFreq = 0;
        int ans = Integer.MAX_VALUE;
        for(int key : map.keySet()){
            int freq = map.get(key);

            if(freq>maxFreq){
                maxFreq = freq;
                ans = key;
            }
            else if(freq == maxFreq){
                ans = Math.min(ans, key);
            }
        }
        System.out.println(ans);
    }
}
