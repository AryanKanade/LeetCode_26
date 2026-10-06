class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int max = 0;
        for(int num : piles){
            max = Math.max(max,num);
        }
        int high = max;
        int mid = -1;
        int ans = -1;
        while(low<=high){
            long sum = 0;
            mid = low+(high-low)/2;
            for(int i=0; i<piles.length; i++){
                sum += (long) Math.ceil((double) piles[i]/mid);
            }
            if(sum<=h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans; 
    }
}