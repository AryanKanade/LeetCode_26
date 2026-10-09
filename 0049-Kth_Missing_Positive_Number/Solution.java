class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        int noOfMissing = 0;
        while(low<=high){
            mid = low+(high-low)/2;
            noOfMissing = arr[mid]-mid-1;
            if(noOfMissing<k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low+k;
    }
}