class Solution {
    public static boolean[] arr = new boolean[26];
    public static void removeDuplicate(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char ch = str.charAt(idx);
        if(arr[ch - 'a'] == true){
            removeDuplicate(str, idx+1, newString);
        }else{
            newString += ch;
            arr[ch - 'a'] = true;
            removeDuplicate(str, idx+1, newString);
        }
    } 

    public static void main (String[] args) {
        
        for(int i=0; i<arr.length; i++){
            arr[i] = false;
        }
        String str = "abbccda";
        removeDuplicate(str, 0, "");
    }
}