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
        /*
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
        */
        //optimal approach - using cancellation
        int n=nums.length;
       int cnt1=0,cnt2=0;
       int el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        if(cnt1==0 && el2!=nums[i]){
            cnt1=1;
            el1=nums[i];
        }else if(cnt2==0 && el1!=nums[i]){
            cnt2=1;
            el2=nums[i];
        }else if(el1==nums[i]) cnt1++;
        else if(el2==nums[i])cnt2++;
        else {cnt1--;cnt2--;}
       }
       cnt1=0;cnt2=0;
       for(int i=0;i<n;i++){
        if(el1==nums[i]) cnt1++;
        if(el2==nums[i])cnt2++;
       }
       int min=n/3+1;
       List<Integer> arr=new ArrayList<>();
       if(cnt1>=min)  arr.add(el1);
       if(cnt2>=min && el1!=el2)arr.add(el2);
       return arr;

    }
}