class Solution {
    public int removeDuplicates(int[] nums) {
      Set<Integer> arr=new TreeSet<>();
      for(int val:nums){
        arr.add(val);
      }  
      int k=arr.size();
      int j=0;
      for(int val:arr){
        nums[j++]=val;
      }
      return k;
    }
}