class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
               
                if(grid[i][j]==1){
                    
                  max = Math.max(findLand(grid, i, j), max);
                    
                        }
                    
                }
            }
    
        return max;
        }
        
        
    
    public int findLand(int [] [] grid , int i, int j ){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) return 0;
        if(grid[i][j]==0) return 0;
        grid[i][j] =0;
      int left = findLand(grid, i-1, j);
     int top= findLand(grid, i, j-1);
     int right=  findLand(grid, i+1, j);
      int bottom = findLand(grid, i, j+1);
        int totalcount = left+right+top+bottom;
        return totalcount+1;
           
    }
}