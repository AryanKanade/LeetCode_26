class Solution {
    public int countOccurrences(int[] arr, int target) {
        int lower = findFirst(arr, target);
        if (lower == -1) {
            return 0;
        }
        int upper = findLast(arr, target);
        return upper - lower;

    }

    public int findFirst(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        int ans = -1;
        while(low<=high){
            mid = low+(high-low)/2;
            if(arr[mid]>=target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public int findLast(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        int ans = arr.length;
        while(low<=high){
            mid = low+(high-low)/2;
            if(arr[mid]>target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}
