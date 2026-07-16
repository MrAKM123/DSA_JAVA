class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int startRow = 0;
        int endRow = m - 1;
        int startCol = 0;
        int endCol = n - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // row wise l -> r; satrting col se ending col tak
            // aur startRow ko ++ kr dena hai
            for (int col = startCol; col <= endCol; col++) {
                output.add(matrix[startRow][col]);
            }
            startRow++;

            //col wise t-> b; starting row se ending row tk
            // aur end col-- krna hai
            for (int row = startRow; row <= endRow; row++) {
                output.add(matrix[row][endCol]);
            }
            endCol--;

            // row wise r -> l; ending col se starting col tk
            // endrow-- krna hai;
            if (startRow <= endRow) {
                for (int col = endCol; col >= startCol; col--) {
                    output.add(matrix[endRow][col]);
                }
            }
            endRow--;
            // col wise b-> t; ending row se starting col tk
            // phir startcol ++ krna h  
            if (startCol <= endCol) {
                for (int row = endRow; row >= startRow; row--) {
                    output.add(matrix[row][startCol]);
                }
            }
            startCol++;

        }
        return output;
    }
}