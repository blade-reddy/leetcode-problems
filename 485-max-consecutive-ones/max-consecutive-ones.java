class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,count=0;
        for(int i:nums){
            if(i!=1) count=0;
            else count++;
        max=Math.max(count,max);
        }
        return max;
    }
}