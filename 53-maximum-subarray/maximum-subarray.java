class Solution {
    public int maxSubArray(int[] nums) {
        //kadane's algorithm
        long max=Long.MIN_VALUE;
        long sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
                max=Math.max(max,sum);
                if(sum>max) max=sum;
                if(sum<0) sum=0;
            }
        return (int)max;
    }
}