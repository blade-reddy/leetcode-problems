class Solution {
    public int[] runningSum(int[] nums) {
        int[] res=new int[nums.length];
        int prod=0;
        for(int i=0;i<nums.length;i++){
            res[i]=prod+nums[i];
            prod=res[i];
        }
        return res;
    }
}