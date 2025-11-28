class Solution {
    public int longestConsecutive(int[] nums) {
        /*
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int longest=1,count=0;
        int last=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==last){
                count++;
                last=nums[i];
            }else if(nums[i]!=last){
                count=1;
                last=nums[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
        */
        //optimal version
        int n=nums.length;
        if(n==0) return 0;
        int longest=1;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int it:set){

            if(!set.contains(it-1)){
                int cnt=1;
                int x=it;

                while(set.contains(x+1)){
                    x+=1;
                    cnt+=1;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
}