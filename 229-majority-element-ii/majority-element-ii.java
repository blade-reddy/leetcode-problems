class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> arr=new ArrayList<>();
        for (int i = 0; i < n; i++) {
          if(arr.size()==0 || arr.get(0)!=nums[i]){
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) count++;
            }
         if(count>n/3) arr.add(nums[i]);
          }
           if(arr.size()==2) break; 
        }
        return arr;
    }
}