class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
        ArrayList<Integer> res=new ArrayList<>(m);
        for(int i=0;i<m;i++){
            res.add(nums1[i]);
        }
          for(int i=0;i<n;i++){
            res.add(nums2[i]);
        }
        Collections.sort(res);
        for(int i=0;i<m+n;i++){
            nums1[i]=res.get(i);
        }
        
        //two-pointer approach
        int i=m-1;
        int j=0;
        while(i>=0 && j<n){
            if(nums1[i]>nums2[j]){
                int temp=nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=temp;
                i--;
                j++;
            }
            else break;
        }
        Arrays.sort(nums1,0,m);
        Arrays.sort(nums2);
        for(int k=m;k<m+n;k++){
            nums1[k]=nums2[k-m];
        }
        */
        // more optimised - GAP method
        int len = m + n;
    int gap = (len / 2) + (len % 2);
    for (int i = m; i < m + n; i++) {
      nums1[i] = nums2[i - m];
    }
    while (gap > 0) {
      int left = 0;
      int right = gap;
      while (right < len) {
        if (nums1[left] > nums1[right]) {
          int temp = nums1[right];
          nums1[right] = nums1[left];
          nums1[left] = temp;
        }
        right++;
        left++;
      }
      if (gap == 1) gap = 0;
    else gap = (gap / 2) + (gap % 2);
    }
    }
}