class Solution {
    private int func(int[] nums, int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)nums[i]/(double)mid); 
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int maxi=Integer.MIN_VALUE;
        for(int k=0;k<nums.length;k++) maxi=Math.max(maxi,nums[k]);
       int low=1,high=maxi,ans=-1;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(func(nums,mid)<=threshold){
            high=mid-1;
        }else low=mid+1;
       }
       return low;
    }
}