class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        /* brute force approach
          int res[]=new int[arr1.length+arr2.length];
     for(int i=0;i<arr1.length;i++) res[i]=arr1[i];
    for(int i=0;i<arr2.length;i++) res[arr1.length+i]=arr2[i];
    Arrays.sort(res);
    if(res.length%2==1){
        return res[res.length/2];
    }
    else return (double)( res[res.length/2 - 1]+res[res.length/2] )/2;

        //without using extra space
         int n1 = arr1.length, n2 = arr2.length;
    int n = n1 + n2;
    int ind2 = n / 2, ind1 = ind2 - 1;
    int cnt = 0;
    int el1 = -1, el2 = -1;
    int i = 0, j = 0;
    while (i < n1 && j < n2) {
      if (arr1[i] < arr2[j]) {
        if (cnt == ind1) el1 = arr1[i];
        if (cnt == ind2) el2 = arr1[i];
        cnt++;
        i++;
      } else {
        if (cnt == ind1) el1 = arr2[j];
        if (cnt == ind2) el2 = arr2[j];
        cnt++;
        j++;
      }
    }
    while (i < n1) {
      if (cnt == ind1) el1 = arr1[i];
      if (cnt == ind2) el2 = arr1[i];
      cnt++;
      i++;
    }
    while (j < n2) {
      if (cnt == ind1) el1 = arr2[j];
      if (cnt == ind2) el2 = arr2[j];
      cnt++;
      j++;
    }
    if(n%2==1) return (double) el2;
    return (double)(el1+el2)/2;
    */
    // using binary search
    int n1 = arr1.length, n2 = arr2.length;

    if (n1 > n2) return findMedianSortedArrays(arr2, arr1);

    int n = n1 + n2;

    int left = (n1 + n2 + 1) / 2;

    int low = 0, high = n1;
    while (low <= high) {
      int mid1 = (low + high) >>> 1;

      int mid2 = left - mid1;

      int l1 = (mid1 > 0) ? arr1[mid1 - 1] : Integer.MIN_VALUE;
      int r1 = (mid1 < n1) ? arr1[mid1] : Integer.MAX_VALUE;
      int l2 = (mid2 > 0) ? arr2[mid2 - 1] : Integer.MIN_VALUE;
      int r2 = (mid2 < n2) ? arr2[mid2] : Integer.MAX_VALUE;

      if (l1 <= r2 && l2 <= r1) {
        if (n % 2 == 1) return Math.max(l1, l2);
        else return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
      } else if (l1 > r2) {
        high = mid1 - 1;
      } else {
        low = mid1 + 1;
      }
    }
    return 0;
    }
}