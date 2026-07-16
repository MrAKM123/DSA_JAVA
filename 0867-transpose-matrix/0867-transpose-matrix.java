class Solution {
    public int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0][0];
        }

        int totalRow = matrix.length;
        int totalColoumn = matrix[0].length;

        int newTotalRow = totalColoumn;
        int newTotalColoumn = totalRow;

        int newMatrix[][] = new int[newTotalRow][newTotalColoumn];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }

        return newMatrix;
    }
}