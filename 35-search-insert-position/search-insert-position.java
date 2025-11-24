class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==1 && target>nums[0]) return 1;
        if(target==nums[nums.length-1]) return nums.length-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==target) return i;
           else if(target>nums[i] && target<nums[i+1]) return i+1;
            if(target>nums[nums.length-1]) return nums.length;
        }
        return 0;
    }
}