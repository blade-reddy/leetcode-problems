class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        List<Integer> arr= new ArrayList<>();
                for(int i=0;i<nums.length;i++){
            if(nums[i]!=val) {
                arr.add(nums[i]);
                count++;
            }
        }
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return count;
    }
}