class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int leftProd=1,rightProd=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i]=rightProd;
            rightProd*=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            res[i]*=leftProd;
            leftProd*=nums[i];
        }
       return res;
    }
}