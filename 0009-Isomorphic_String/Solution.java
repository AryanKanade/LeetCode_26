import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            char key = s.charAt(i);
            char val = t.charAt(i);
            if(map.containsKey(key)){
                if(map.get(key) != val){
                    return false;
                }
            }else if(map.containsValue(val)){
                return false;   
            }else{
                map.put(key, val);
            }
            
        }
        return true;
    }
}