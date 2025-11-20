class Solution {
    public int majorityElement(int[] nums) {
        //using hashing
        int n=nums.length;
        HashMap<Integer,Integer> arr=new HashMap<>();
        for(int num:nums){
            arr.put(num,arr.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:arr.entrySet()){
            if(entry.getValue()>n/2) return entry.getKey();
        }
        return -1;
    }
}