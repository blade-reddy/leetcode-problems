class Solution {
    public int removeDuplicates(int[] nums) {
      List<Integer> arr=new ArrayList<>();
      for(int i=0;i<nums.length;i++){
        if(!arr.contains(nums[i])) arr.add(nums[i]);
      } 
     int it=0;
     for(int i:arr) nums[it++]=i;
     return arr.size();
    }
}