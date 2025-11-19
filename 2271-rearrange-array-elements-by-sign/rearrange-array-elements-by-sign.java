class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[]res=new int[nums.length*2];
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
        int[]res2=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res2[i]=res[i];
        }
        return res2;
    }
}