class Solution {
    
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int j = s.length()-1;
        int i = 0;
        return PalindromeHelper(s, i, j);
    }

    private boolean PalindromeHelper(String s, int i, int j) {
        if(i >= j){
            return true;
        }

        if(s.charAt(i) == s.charAt(j)){
            return PalindromeHelper(s,i+1,j-1);
        }else{
            return false;
        }
    }
}