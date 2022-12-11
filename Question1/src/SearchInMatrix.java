public class SearchInMatrix {
	
	public static boolean doesContain ( int[][] matrix,int target){
		
		int row = matrix.length;
		int col = matrix[0].length;
		
		int currentRow = row -1 ;
		int currentCol = 0;
		
		while ( currentRow >=0 && currentCol <= col-1){
			if( matrix[currentRow][currentCol] == target){
				return true;
				}
			else if (matrix[currentRow][currentCol] <target){
				currentCol++;
			}
				else currentRow--;
			}
		return  false;
	}
	
}
