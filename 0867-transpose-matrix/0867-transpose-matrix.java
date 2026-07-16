class Solution {
    public int[][] transpose(int[][] matrix) {
       if(matrix == null || matrix.length==0){
        return new int[0][0];
       } 
      //for original matrix
      int totalRow=matrix.length;
      int totalColumn= matrix[0].length;
      // for tanspose matrix
      int newtotalRow =totalColumn;
      int newtoalColumn= totalRow;

      int newMatrix[][]= new int[totalColumn][totalRow] ;

      // Actuall logic
       for(int i=0; i<totalRow; i++){
        for(int j=0; j<totalColumn; j++){
            newMatrix[j][i] = matrix[i][j];
        }
       } 

      return newMatrix;

    }
}