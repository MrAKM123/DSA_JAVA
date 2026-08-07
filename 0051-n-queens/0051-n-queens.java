class Solution {

    static boolean isSafeToMove(int rowIndex, int colIndex, int n, char[][] board) {
        //horizontal left
        int row = rowIndex;
        int col = colIndex;

        while (col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            col--;
        }
        //upper left diagonal
        row = rowIndex;
        col = colIndex;
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row--;
            col--;
        }
        // lower left diagonal
        row = rowIndex;
        col = colIndex;
        while (row < n && col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row++;
            col--;
        }
        return true;

    }

    static void solve(char[][] board, int n, int colIndex, List<List<String>> ans) {
        if (colIndex >= n) {
            //bc
            // iska mtlb hme possible arrangement mil chuka h
            //answer me store kra lenge
            // phle ek temp list me string ko add krenge phir list kko ans me store kr lenge
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for (int rowIndex = 0; rowIndex < n; rowIndex++) {
            if (isSafeToMove(rowIndex, colIndex, n, board)) {
                board[rowIndex][colIndex] = 'Q';
                solve(board, n, colIndex + 1, ans);
                // backtracking
                board[rowIndex][colIndex] = '.';
            }

        }
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i<n; i++) {
            Arrays.fill(board[i], '.');
        }
        int colIndex = 0;
        List<List<String>> ans = new ArrayList<>();
        solve(board, n, colIndex, ans);
        return ans;
    }
}