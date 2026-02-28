class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> arr=new ArrayList<>();
        int i=num.length-1, cur=k;
        while(i>=0||cur>0){
            if(i>=0) cur+=num[i];
            arr.add(cur%10);
            cur/=10;
            i--;
        }
        Collections.reverse(arr);
        return arr;
    }
}