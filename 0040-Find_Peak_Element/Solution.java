class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        int low = 1;
        int high = nums.length-2;
        int mid = 0;
        while(low<=high){
            mid = low +(high-low)/2;
            if(nums[mid+1]<nums[mid] && nums[mid-1]<nums[mid]){
                return mid;
            }
            else if(nums[mid+1]>nums[mid]){
                low = mid+1;
            }
            else if(nums[mid-1]>nums[mid]){
                high = mid-1;
            }
        }
        return -1;
    }
}