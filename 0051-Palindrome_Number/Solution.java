class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev = 0;
        int y = x;
        while(y!=0){
            int dig = y%10;
            y = y/10;
            rev = rev * 10 + dig;
        }
        if(x == rev){
            return true;
        }
        return false;
    }
}