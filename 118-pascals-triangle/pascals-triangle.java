class Solution {
        private List<Integer> generateRow(int row){
        long ans=1;
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        for(int i=1;i<row;i++){
            ans*=(row-i);
            ans/=i;
            arr.add((int)ans);
        }
        return arr;
    }
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> pascalTriangle = new ArrayList<>();
        for(int it=1;it<=numRows;it++){
            pascalTriangle.add(generateRow(it));
        }
        return pascalTriangle;
    }
}