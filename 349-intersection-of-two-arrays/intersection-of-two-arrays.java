class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> result=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        for(int j:nums2){
            if(set.contains(j)) result.add(j);
        }
        int[]res=new int[result.size()];
        int it=0;
        for(int x:result){
            res[it++]=x;
        }
        Arrays.sort(res);
        return res;
    }
}
