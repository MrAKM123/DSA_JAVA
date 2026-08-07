class Solution {
        static int count =0;
    public int totalNQueens(int n) {
         count =0;
            
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        int colIndex = 0;
        
        solve(board, colIndex, n);
        return count;
    }

    static void solve(char[][] board, int colIndex, int n) {
        // int count =0;
        if (colIndex == n) {
            count++;
            return;
        }
        for (int rowIndex = 0; rowIndex < n; rowIndex++) {
            if (isSafe(rowIndex, colIndex, n, board)) {
                board[rowIndex][colIndex] = 'Q';
                solve(board, colIndex + 1, n);

                board[rowIndex][colIndex] = '.';
            }
        }
    }

    static boolean isSafe(int rowIndex, int colIndex, int n, char[][] board) {
        //same row or horizontal left attacks
        int r = rowIndex;
        int c = colIndex;
        while (c >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }
            c--;
        }
        //upper left diagonal attack
        r = rowIndex;
        c = colIndex;
        while (c >= 0 && r >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }
            c--;
            r--;
        }
        // lower left dioagonal attacks
        r = rowIndex;
        c = colIndex;
        while (c >= 0 && r < n) {
            if (board[r][c] == 'Q') {
                return false;
            }
            c--;
            r++;
        }
        return true;
    }
}