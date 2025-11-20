class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[]res=new int[nums.length];
        int k=0,j=1;
        for(int i:nums){
            if(i>0){
                res[k]=i;
                k+=2;
            }else{
                res[j]=i;
                j+=2;
            }
        }
        return res;
    }
}