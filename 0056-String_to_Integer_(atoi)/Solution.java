class Solution {
    public int myAtoi(String s) {
        int res = 0;
        int sign = 1;
        int i = 0;
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        if(i < s.length() && s.charAt(i) == '-'){
            sign = -1;
            i++;
        }else if(i < s.length() && s.charAt(i) == '+'){
            i++;
        }

        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > 7)){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + digit;
            i++;
        }

        return res * sign;
    }
}
