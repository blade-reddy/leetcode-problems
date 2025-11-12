class Solution {
    public boolean search(int[] nums, int target) {
        //bruteforce approach - basically a linear search O(n)
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return true;
        }
        return false;
    }
}
