class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //bruteforce approach - hashing
        Set<List<Integer>> tripletSet=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> hashset = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                    int third=-(nums[i]+nums[j]);
                    if(hashset.contains(third)){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);
                    Collections.sort(temp);
                    tripletSet.add(temp);
                    }
                    hashset.add(nums[j]);
                }
            }
        List<List<Integer>> ans=new ArrayList<>(tripletSet);
        return ans;
    }
}