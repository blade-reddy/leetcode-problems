class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int longest=1,count=0;
        int last=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==last){
                count++;
                last=nums[i];
            }else if(nums[i]!=last){
                count=1;
                last=nums[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}