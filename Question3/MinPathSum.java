// Time Complexity O( M X N )


public class MinPathSum {
	private static int minimumPathSum(int[][] matrix){
		
		int row = matrix.length;
		int col = matrix[0].length;
		
		int [][] result = new int[row][col];
		result[0][0] = matrix[0][0];
		
		//initialize 1st row and column of the result matrix
		
		for (int i=1 ; i< row; i++){
			result[i][0] = matrix[i][0] + result[i-1][0];
		}
		
		for (int i=1 ; i< col; i++){
			result[0][i] = matrix[0][i] + result[0][i-1];
		}
		for(int m = 1 ; m < row;  m++) {
			for(int n = 1 ; n < col;  n++) {
				result[m][n] = matrix[m][n] + Math.min(result[m-1][n],result[m][n -1] );
			}
		}
		
		return result[row-1][col-1];
	}
}
