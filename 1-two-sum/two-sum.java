class Solution {
    public int[] twoSum(int[] nums, int target) {
        // better approach - using hashmap
        Map<Integer,Integer> mpp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int num=nums[i];
            int moreNeeded=target-nums[i];
            if(mpp.containsKey(moreNeeded)){
                return new int[]{mpp.get(moreNeeded),i};
            }
            mpp.put(num,i);
        }
        return new int[]{-1,-1};
    }
}