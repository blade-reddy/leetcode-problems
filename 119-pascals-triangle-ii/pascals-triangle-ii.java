class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> arr=new ArrayList<>();
        long val=1;
        arr.add(1);
        for(int i=1;i<=rowIndex;i++){
            val=val*(rowIndex - (i - 1)) / i;
            arr.add((int)val);
        }
        return arr;
    }
}