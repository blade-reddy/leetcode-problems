class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         /* Brute force approach
         List<List<Integer>> ans = new ArrayList<>();
    int n = nums.length;
    Set<List<Integer>> set = new HashSet<>();
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        Set<Long> hashset = new HashSet<>();
        for (int k = j + 1; k < n; k++) {
          long sum = (long) nums[i] + nums[j] + nums[k];
          long fourth = target - sum;
          if (hashset.contains(fourth)) {
            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int) fourth);
            Collections.sort(temp);
            set.add(temp);
          }
          hashset.add((long) nums[k]);
        }
      }
    }
    ans.addAll(set);
    return ans;
    */
    // using two pointer approach
     List<List<Integer>> ans = new ArrayList<>();
    int n = nums.length;
    Arrays.sort(nums);
    for (int i = 0; i < n; i++) {
        if(i>0 && nums[i]==nums[i-1]) continue;
      for (int j = i + 1; j < n; j++) {
        if(j>i+1 && nums[j]==nums[j-1]) continue;
        int k=j+1;
        int l=n-1;
        while(k<l){
            long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
            if(sum==target){
                List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                ans.add(temp);
                k++;
                l--;
                while(k<l && nums[k]==nums[k-1])k++;
                while(k<l && nums[l]==nums[l+1])l--;
            }else if(sum<target){
                k++;
            }else{
                l--;
            }
        }
        
      }
    }
    return ans;
    }
}