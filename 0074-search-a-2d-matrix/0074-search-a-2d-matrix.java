class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalColumn = matrix[0].length;

        int n = totalRow * totalColumn;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            int rowIndex = mid / totalColumn;
            int colIndex = mid % totalColumn;
            if (matrix[rowIndex][colIndex] == target) {
                return true;

            }
            if (matrix[rowIndex][colIndex] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return false;
    }
}