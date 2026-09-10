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

// Better Solution:-

// class Solution {
//     public int search(int[] nums, int target) {

//         int low = 0;
//         int high = nums.length - 1;

//         while (low <= high) {

//             int mid = low + (high - low) / 2;

//             if (nums[mid] == target) {
//                 return mid;
//             }

//             // Left half is sorted
//             if (nums[low] <= nums[mid]) {

//                 // Target lies in the sorted left half
//                 if (nums[low] <= target && target < nums[mid]) {
//                     high = mid - 1;
//                 } 
//                 else {
//                     low = mid + 1;
//                 }
//             }

//             // Right half is sorted
//             else {

//                 // Target lies in the sorted right half
//                 if (nums[mid] < target && target <= nums[high]) {
//                     low = mid + 1;
//                 } 
//                 else {
//                     high = mid - 1;
//                 }
//             }
//         }

//         return -1;
//     }
// }