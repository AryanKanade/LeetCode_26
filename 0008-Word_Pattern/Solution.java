import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length()!= words.length){
            return false;
        }
        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            boolean containskey = map.containsKey(ch);
            if(map.containsValue(words[i]) && !containskey){
                return false;
            }else if(containskey && !map.get(ch).equals(words[i])){
                return false;
            }else{
                map.put(ch, words[i]);
            }
        }
        return true;
    }
}