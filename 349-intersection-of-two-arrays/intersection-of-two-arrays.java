class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> res = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                res.add(num);
            }
        }

        int[] arr = new int[res.size()];
        int i = 0;
        for (int num : res) {
            arr[i++] = num;
        }

        return arr;
    }
}
