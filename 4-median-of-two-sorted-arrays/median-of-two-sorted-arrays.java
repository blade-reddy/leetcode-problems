class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int res[]=new int[arr1.length+arr2.length];
     for(int i=0;i<arr1.length;i++) res[i]=arr1[i];
    for(int i=0;i<arr2.length;i++) res[arr1.length+i]=arr2[i];
    Arrays.sort(res);
    if(res.length%2==1){
        return res[res.length/2];
    }
    else return (double)( res[res.length/2 - 1]+res[res.length/2] )/2;
    }
}