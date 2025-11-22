class Solution {
    public void sortColors(int[] nums) {
        /*
        brutte force approcah - sorting the array
       int n=nums.length;
       for(int i=0;i<nums.length;i++){
        int j=i;
        while(j>0 && nums[j-1]>nums[j]){
            int temp=nums[j];
            nums[j]=nums[j-1];
            nums[j-1]=temp;
            j--;
        }
       } */
       //using loops
       int count0=0,count1=0,count2=0;
for(int i=0;i<nums.length;i++){
    if(nums[i]==0)count0++;
    else if(nums[i]==1)count1++;
    else count2++;
}
for(int i=0;i<count0;i++)nums[i]=0;
for(int i=count0;i<count0+count1;i++)nums[i]=1;
for(int i=count0+count1;i<nums.length;i++)nums[i]=2;
    }
}