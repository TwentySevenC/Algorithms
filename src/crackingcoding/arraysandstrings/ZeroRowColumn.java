package crackingcoding.arraysandstrings;

/**
 * Cracking the Coding Interview
 * @author liujian
 * 
 * 1.7 Write an algorithm such that if an element in an MxN matrix is 0, its entire row
 * and column are set to 0.
 *
 */

public class ZeroRowColumn {
	public static void zeroRowColumn(int[][] array, int row, int column){
		int[] zeroRow = new int[row];
		int[] zeroColumn = new int[column];
		int index = 0;
		
		for(int i = 0; i < row; i++)
			for(int j = 0; j < column; j++){
				if(array[i][j] == 0){
					zeroRow[index] = i;
					zeroColumn[index] = j;
					index++;
				}
			}

		if(index <= 0)
			return ;
		
		while(index > 0){
			for(int i = 0; i < column; i++){
				array[zeroRow[index-1]][i] = 0;
			}
			for(int i = 0; i < row; i++){
				array[i][zeroColumn[index-1]] = 0;
			}
			index--;
		}
		
	}
	
	public static void main(String[] args) {
		int[][] array = new int[][]{
			{1,2,3,4},
			{2,0,0,9},
			{8,7,9,4}
		};
		
		zeroRowColumn(array, 3, 4);
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
