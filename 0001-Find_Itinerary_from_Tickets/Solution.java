import java.util.*;

public class Solution {
    public static String getStart(HashMap<String, String> map1, HashMap<String, String> map2){
        
        for(String key : map1.keySet()){
            if(map2.containsKey(key) == false){
                return key;
            }
        }

        return null;
    }

    public static void main (String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();

        map1.put("Chennai", "Bengaluru");
        map1.put("Mumbai", "Delhi");
        map1.put("Goa", "Chennai");
        map1.put("Delhi", "Goa");

        map2.put("Bengaluru", "Chennai");
        map2.put("Delhi", "Mumbai");
        map2.put("Chennai", "Goa");
        map2.put("Goa", "Delhi");

        String start = getStart(map1, map2);
        while(map1.containsKey(start)){
            System.out.print(start+ "->");
            start = map1.get(start);
        }
        System.out.println(start);
    }
}
