class Solution {
    public void sortColors(int[] nums) {
        /*
        1) brutte force approcah - sorting the array
       int n=nums.length;
       for(int i=0;i<nums.length;i++){
        int j=i;
        while(j>0 && nums[j-1]>nums[j]){
            int temp=nums[j];
            nums[j]=nums[j-1];
            nums[j-1]=temp;
            j--;
        }
       }
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
*/
//Dutch national flag algorithm - most optimal
  int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
    }
}