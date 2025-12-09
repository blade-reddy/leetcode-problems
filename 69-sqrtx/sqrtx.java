class Solution {
    public int mySqrt(int x) {
        int ans = 0;
        for (int i = 1; i <= x; i++) {
            if ((long) i * (long) i <= x)
                ans = i;
            else
                break;
        }
        return ans;
    }
}