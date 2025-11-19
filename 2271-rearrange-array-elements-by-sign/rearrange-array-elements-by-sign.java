class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[]res=new int[nums.length];
        int k=0,j=0;
        for(int i:nums){
            if(i>0){
                res[2*k]=i;
                k++;
            }else{
                res[2*j+1]=i;
                j++;
            }
        }
    
        return res;
    }
}