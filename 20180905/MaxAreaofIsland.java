class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) return 0;
        int row = grid.length;
        int col = grid[0].length;
        int max = 0;
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                // visit each value
                if(grid[i][j] == 1) {
                    // check it surrounding area
                   int temp = maxIsland(grid,i,j);
                    if(temp >max) max = temp;
                }
            }
        }
        return max;
    }


    public int maxIsland(int[][] grid, int i, int j) {
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length) return 0;

        if(grid[i][j]==1) {
            // change visited grid value
            grid[i][j] = 2;
            int up = maxIsland(grid,i-1,j);
            int down = maxIsland(grid,i+1,j);
            int left = maxIsland(grid,i,j-1);
            int right = maxIsland(grid,i,j+1);
            return 1+up+down+left+right;
        }
        return 0;

    }
}
