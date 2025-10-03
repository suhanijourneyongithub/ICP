package BackTracking;

public class WordSearch79 {
    private boolean isWord(char[][] board, String word, boolean[][] visited, int i, int j, int k) {
        if (k == word.length()) {
            return true;
        }
        
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(k)) {
            return false;
        }
        
        visited[i][j] = true;
        
        if (isWord(board, word, visited, i + 1, j, k + 1) || isWord(board, word, visited, i - 1, j, k + 1) || 
            isWord(board, word, visited, i, j + 1, k + 1) || isWord(board, word, visited, i, j - 1, k + 1)) {
            return true;
        }
        
        visited[i][j] = false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] visited = new boolean[n][m]; //while backtraking by mistake we can pick a char twice by mistake leading to logical error
        boolean isFound = false;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == word.charAt(0)){
                    isFound = isWord(board, word, visited, i, j, 0);
                }
                if(isFound){
                    return isFound;
                }
            }
        }
        return false;
    }
}