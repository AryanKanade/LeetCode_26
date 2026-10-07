class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = weights[0];
        int high = 0;
        for(int num : weights){
            low = Math.max(num, low);
            high += num;
        }
        int mid = 0;
        int ans = 0;
        while(low<=high){
            mid = low+(high-low)/2;
            if(possible(weights, days, mid) == true){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public boolean possible(int[] weights, int days, int mid){
        int sum = 0;
        int count = 1;
        for(int num : weights){
            if(sum+num<=mid){
                sum+=num;
            }else{
                count++;
                sum = num;
            }
        }
        if(count<=days){
            return true;
        }else{
            return false;
        }
    }
}