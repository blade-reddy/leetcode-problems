class Solution {
    public int maxProduct(int[] nums) { 
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
    }
}