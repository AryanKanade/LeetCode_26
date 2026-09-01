// Soln-1 with binary search
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
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
        return low;
    }
}


// Soln-2 with linear search
// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int i;
//         int idx = 0;
//         int flag = 0;
//         for(i=0; i<nums.length; i++){
//             if(nums[i] == target){
//                 idx = i;
//                 flag = 1;
//                 return idx;
//             }
//         }
//         if(flag == 0){
//             if(target < nums[0]){
//                 return 0;
//             }
//             for(i=0; i<(nums.length-1); i++){
//                 if(target>nums[i] && target<nums[i+1]){
//                     idx = (i+1);
//                     return idx;
//                 }
//             }
//         }
//         return nums.length;
//     }
// }