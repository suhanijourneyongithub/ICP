class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;

        int[] drow = {0, 1, 0, -1};
        int[] dcol = {1, 0, -1, 0};

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (grid[i][j] == '1'){   
                    count++;
                    dfs(grid, i, j, n, m, drow, dcol);
                }
            }
        }
        return count;
    }

    void dfs(char[][] grid, int r, int c, int n, int m, int[] drow, int[] dcol){
        if (r < 0 || r >= n || c < 0 || c >= m || grid[r][c] != '1'){
            return;
        }
        grid[r][c] = '0';
        for (int i = 0; i < 4; i++){
            dfs(grid, r + drow[i], c + dcol[i], n, m, drow, dcol);
        }
    }
}