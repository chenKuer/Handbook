class Solution {
    public int numIslands(char[][] grid) {
      int n = grid.length;
      int m = grid[0].length;
      int count = 0;
      for(int i = 0; i< n; i++) {
        for(int j = 0; j < m; j++){
          if(grid[i][j] == '1') {
            // check up, down, left, right
            check(grid,i,j);
            ++count;
          }
        }
      }
      return count;
    }

    // DFS
    public void check(char[][] grid, int i, int j) {
      if(i<0 || i >= grid.length || j<0 || j>=grid[0].length || grid[i][j] != '1') return;
      // visited
      grid[i][j] = 'X';
      check(grid,i,j-1);
      check(grid,i, j+1);
      check(grid,i-1,j);
      check(grid,i+1, j);
    }

}
