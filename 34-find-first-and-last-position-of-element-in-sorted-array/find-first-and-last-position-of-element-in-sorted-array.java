class Solution {
    public int lowerBound(int[]nums, int target){
        int low=0,high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=(low+high)/2;

            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int upperBound(int[]nums, int target){
        int low=0,high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=(low+high)/2;

            if(nums[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        /*
        //using linear search
       int first=-1,last=-1;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            if(first==-1)first=i;
            last=i;
        }
    }
    return new int[]{first,last}; 
    */
//using upper bound and lower bounds
 int a=lowerBound(nums,target);
        if (a==nums.length || nums[a]!=target) return new int[]{-1,-1};

        int b=upperBound(nums,target)-1;

        return new int[]{a,b};
    }
}