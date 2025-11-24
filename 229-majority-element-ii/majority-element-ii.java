class Solution {
    public List<Integer> majorityElement(int[] nums) {
        /*
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
        */
        // using hashing
         int n=nums.length;
        List<Integer> arr=new ArrayList<>();
        Map<Integer,Integer> mpp=new HashMap<>();
        int min=n/3+1;
        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
            if(mpp.get(nums[i])==min) arr.add(nums[i]);
                    if(arr.size()==2)break;
        }
        return arr;
    }
}