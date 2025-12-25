class Solution {
    private int func(int[]nums , int mid){
        int sum=0;
        for(int i:nums)sum+=Math.ceil((double)i/(double)mid);
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low=0,high=piles[piles.length-1];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(func(piles,mid)<=h)high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}