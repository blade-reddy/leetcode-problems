class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        for(int i:nums){
            if(i!=0) arr.add(i);
        }
        for(int i=0;i<nums.length;i++){
            if(i<arr.size()){
                nums[i]=arr.get(i);
            }else{
                nums[i]=0;
            }
        }
    }
}