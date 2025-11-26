class Solution {
    public int maxProduct(int[] nums) { 
        /*
        // brute approach optimised to O(n2)
          int res = nums[0];
    for (int i = 0; i < nums.length; i++) {
                int prod=nums[i];
      for (int j = i+1; j < nums.length; j++) {
         res=Math.max(prod,res);
          prod*=nums[j];
      }
      res=Math.max(prod,res);
    }
    return res;
    */
    // most optimal approach - suffix-prefix product
      int prefix=1,suffix=1;
    int res=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        if(prefix==0)prefix=1;
        if(suffix==0)suffix=1;
        prefix*=nums[i];
        suffix*=nums[nums.length-i-1];
        res=Math.max(res,Math.max(prefix,suffix));
    }  
    return res;
    }
}