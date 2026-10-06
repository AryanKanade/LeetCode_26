class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int max = 0;
        for(int num : nums){
            max = Math.max(max,num);
        }
        int high = max;
        int mid = -1;
        int ans = -1;
        while(low<=high){
            int sum = 0;
            mid = low+(high-low)/2;
            for(int i=0; i<nums.length; i++){
                sum += (int) Math.ceil((double) nums[i]/mid);
            }
            if(sum<=threshold){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}