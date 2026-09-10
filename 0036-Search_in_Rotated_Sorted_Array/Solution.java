class Solution {
    public int search(int[] nums, int target) {
        int minint = Integer.MAX_VALUE;
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] <= minint){
                minint = nums[i];
                idx = i;
            }
        }
        int low = idx;
        int high = nums.length-1;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] <= target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        low = 0;
        high = idx-1;
        mid = 0;
        while(low <= high){
            mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] <= target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}