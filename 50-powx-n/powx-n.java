class Solution {
    private double myPows(double x, long n){
        if(n==0) return 1;
        if(n==1) return x;
        if(n%2==0) return myPows(x*x,n/2);
        return x*myPows(x,n-1);
    }
    public double myPow(double x, int n) {
          long num=n;
          if(num<0) return (1.0/myPows(x,-num));
        return myPows(x,num);
    }
}