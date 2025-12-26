class Solution {
    private int func(int day,int k,int[]nums){
        int count=0, beqs=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=day) count++;
            else{
                beqs+=count/k;
                count=0;
            } 
        }
        beqs+=count/k;
        return beqs;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
    if ((long)m * k > n) return -1;
    int high=Integer.MIN_VALUE,low=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        low=Math.min(low,bloomDay[i]);
        high=Math.max(high,bloomDay[i]);
    }
    while(low<=high){
        int mid=low+(high-low)/2;
        if(func(mid,k,bloomDay)>=m)high=mid-1;
        else low=mid+1;
    }
    return low;
  }
}