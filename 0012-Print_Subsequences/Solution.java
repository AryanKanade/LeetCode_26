import java.util.*;

// 1.

// public class Solution {
//     public static void subSequences(String str, int idx, String newString){
//         if(idx == str.length()){
//             System.out.println(newString);
//             return;
//         }

//         char currChar = str.charAt(idx);

//         subSequences(str, idx+1, newString+currChar);
//         subSequences(str, idx+1, newString);
//     }

//     public static void main(String args[]){
//         String str = "abc";
//         subSequences(str, 0, "");
//     }
// }


// 2.
// For Unique SubSequence

public class Solution {
    public static void subSequences(String str, int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);
        //Include Character
        subSequences(str, idx+1, newString+currChar, set);

        //Do not Include Character
        subSequences(str, idx+1, newString, set);
    }

    public static void main(String args[]){
        HashSet<String> set = new HashSet<>();
        String str = "aaa";
        subSequences(str, 0, "", set);
    }
}