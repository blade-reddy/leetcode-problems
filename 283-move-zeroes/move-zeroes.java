class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        List<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                arr.add(nums[i]);
            }
        }
        int a=arr.size();
        for(int i=0;i<n-a;i++){
            arr.add(0);
        }
        for(int i=0;i<n;i++){
            nums[i]=arr.get(i);
        }
    }
}