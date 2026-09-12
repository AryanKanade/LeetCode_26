class Solution {
    public int mySqrt(int n) {
      int ans = 0;
      int low = 1;
      int high = n;
      int mid = 0;
      while(low<=high){
        mid = low + (high-low)/2;
        if(mid<=n/mid){
            ans = mid;
            low = mid + 1;
        }else{
            high = mid-1;
        }
      }
      return ans;
    }
}