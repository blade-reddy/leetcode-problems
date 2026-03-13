class Solution {
    public int arraySign(int[] nums) {
        int r=1;
        for(int i:nums){
            if(i==0) return 0;
            else if(i>0) r*=1;
            else r*=-1;
        }
        return r;
    }
}