class Solution {
    public boolean search(int[] nums, int target) {
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] == target){
        //         return true;
        //     }
        // }
        // return false;
        int idx = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                idx = i+1;
            }
        }
        int low = idx;
        int high = nums.length-1;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low)/2;
            if(nums[mid] == target){
                return true;
            }else if(nums[mid] <= target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        low = 0;
        high = idx-1;
        while(low <= high){
            mid = low + (high - low)/2;
            if(nums[mid] == target){
                return true;
            }else if(nums[mid] <= target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
}

// better Solution:-

// class Solution {
//     public boolean search(int[] nums, int target) {

//         int low = 0;
//         int high = nums.length - 1;

//         while (low <= high) {

//             int mid = low + (high - low) / 2;

//             if (nums[mid] == target) {
//                 return true;
//             }

//             // Duplicate values: cannot determine sorted half
//             if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
//                 low++;
//                 high--;
//             }

//             // Left half is sorted
//             else if (nums[low] <= nums[mid]) {

//                 if (nums[low] <= target && target < nums[mid]) {
//                     high = mid - 1;
//                 } else {
//                     low = mid + 1;
//                 }
//             }

//             // Right half is sorted
//             else {

//                 if (nums[mid] < target && target <= nums[high]) {
//                     low = mid + 1;
//                 } else {
//                     high = mid - 1;
//                 }
//             }
//         }

//         return false;
//     }
// }