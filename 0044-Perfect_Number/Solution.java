class Solution {
    public boolean checkPerfectNumber(int num) {
        int half = num/2;
        int sum = 0;
        for(int i=1; i<=half; i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum!=num){
            return false;
        }else{
            return true;
        }
    }
}