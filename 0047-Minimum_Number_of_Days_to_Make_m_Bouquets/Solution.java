class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length){
            return -1;
        }
        int low = bloomDay[0];
        int high = bloomDay[0];
        for(int day : bloomDay){
            low = Math.min(low, day);
            high = Math.max(high, day);

        }
        int mid = 0;
        int ans = -1;
        while(low<=high){
            mid = low+(high-low)/2;
            if(possibility(bloomDay, mid, m, k)==true){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public boolean possibility(int[] bloomDay, int mid, int m, int k){
        int count = 0;
        int value = 0;
        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i]<=mid){
                count++;
            }else{
                value += (count/k);
                count = 0;
            }
        }
        value += (count/k);
        if(value >= m){
            return true;
        }else{
            return false;
        }
    }
}