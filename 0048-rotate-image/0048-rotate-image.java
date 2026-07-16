class Solution {
    public void rotate(int[][] matrix) {

        int n=matrix.length;
        int m =matrix[0].length; //no.of row and col
        //transpose to matrix(in place )
        for(int i= 0; i< n; i++){
            for(int j =i+1; j<m; j++){
                //swap uper trangular matrix
                int temp= matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //revrse each row of transposed matrix

        for(int row=0; row < n; row++){
            int startcol=0;
            int endcol= m-1;
           while(startcol<= endcol){
             int temp= matrix[row][startcol];
                matrix[row][startcol] = matrix[row][endcol];
                matrix[row][endcol] = temp;
                startcol++;
                endcol--;

            }
        }

    }
}