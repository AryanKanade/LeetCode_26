class Solution {
    public int[] twoSum(int[] nums, int target) {
        int right = nums.length-1;
        int left = 0;
        while(left<right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                return new int[]{left, right};
            }else if(sum>target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{};
    }
}