class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /*
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
        */
        //optimal approach - two pointer
         List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
           if(i>0&& nums[i]==nums[i-1])continue;
           int j=i+1;
           int k=n-1;
           while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum<0){
                j++;
            }else if(sum>0){
                k--;
            }else{
                List<Integer>temp=new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[j]);
                temp.add(nums[k]);
                ans.add(temp);
                j++;
                k--;
                while(j<k && nums[j]==nums[j-1])j++;
                while(j<k &&nums[k]==nums[k+1])k--;
            }
           }
            }
        return ans; 
    }
}