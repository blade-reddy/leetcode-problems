class Solution {
    public int findPeakElement(int[] arr) {
        /* linear search
         for (int i = 0; i < nums.length; i++) {
      if ((i == 0 || nums[i] > nums[i - 1]) && (i == nums.length-1 || nums[i] > nums[i + 1])) return i;
    }
    return -1;
    */
    //binary search
    int n=arr.length;
        if (n == 1) return 0;
        if (arr[0] > arr[1]) return 0;
        if (arr[n - 1] > arr[n - 2]) return n - 1;
    int low=1,high=n-2;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return mid;
        if(arr[mid]>arr[mid-1])low=mid+1;
        else high=mid-1;
    }
    return -1;
    }
}