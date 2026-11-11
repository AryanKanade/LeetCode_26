class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                count++;
            }else{
                count--;
            }
            if(count == 2){
                while(count != 0){
                    sb.append(s.charAt(i));
                    i++;
                    if(s.charAt(i) == '('){
                        count++;
                    }else{
                        count--;
                    }
                }
            }
        }
        s = sb.toString();
        return s;
    }
}