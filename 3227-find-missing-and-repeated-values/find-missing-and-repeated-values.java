class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length*grid[0].length;
        Map<Integer,Integer> mpp=new HashMap<>();
        int[] arr=new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                mpp.put(grid[i][j],mpp.getOrDefault(grid[i][j],0)+1);
            }
        }
        for(int i=0;i<=n;i++){
            int freq=mpp.getOrDefault(i,0);
            if(freq>1)arr[0]=i;
            if(freq==0)arr[1]=i;
        }
        return arr;
    }
}