class Solution {
    public int mySqrt(int x) {
        /*
        int ans = 0;
        for (int i = 1; i <= x; i++) {
            if ((long) i * (long) i <= x)
                ans = i;
            else
             
                break;
        }
        return ans;
        */
        //using binary search
       int low=1,high=x;
      while(low<=high){
        int mid=low+(high-low)/2;
        long val=(long)mid*(long)mid;
        if(val<=(long)x)low=mid+1; 
        else high=mid-1;
      }
      return high;
    }
}