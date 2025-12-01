class Solution {
    public int subarraySum(int[] nums, int k) {/*
    //brute force approach- near to O(n3)
        int count = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        int sum = 0;
        for (int ka = i; ka <= j; ka++) {
          sum += nums[ka];
        }
        if (sum == k) {
          count++;
        }
      }
    }
    return count;
    //better approach - O(n2)
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
        int sum = 0;
      for (int j = i; j < nums.length; j++) {
        sum+=nums[j];
        if (sum == k) count++;
      }
    }
    return count;
    */
    //optimal version- using prefix sum+hashmap.
  int count=0;
       int sum=0;
       Map<Integer,Integer> mpp=new HashMap<>();
       mpp.put(0,1);
       for(int i=0;i<nums.length;i++){
         sum+=nums[i];
         int rem=sum-k;
         count+=mpp.getOrDefault(rem,0);
         mpp.put(sum,mpp.getOrDefault(sum,0)+1);
       } 
       return count;
    }
}