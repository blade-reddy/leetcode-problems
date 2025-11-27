class Solution {
     private int pivotLeft(int k,int[] nums){
            int left=0;
            for(int i=0;i<k;i++){
                left+=nums[i];
            }
            return left;
        }
        private int pivotRight(int k, int[]nums){
            int right=0;
            for(int i=k+1;i<nums.length;i++){
                right+=nums[i];
            }
            return right;
        }
    public int pivotIndex(int[] nums) {
       int i=0;
        while(i<nums.length){
            if(pivotLeft(i,nums)==pivotRight(i,nums)) return i;
            i++;
        }
        return -1;
    }
}