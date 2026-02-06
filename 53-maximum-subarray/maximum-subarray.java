class Solution {
    public int maxSubArray(int[] nums) {
        /*
         int maxi=Integer.MIN_VALUE;;
        for(int i=0;i<nums.length;i++){
                int sum = 0;
                for (int k = i; k < nums.length; k++) {
                    sum += nums[k];
                maxi = Math.max(maxi, sum);
                }
            }
        return maxi;
           */
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