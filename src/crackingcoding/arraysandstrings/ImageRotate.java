package crackingcoding.arraysandstrings;


/**
 * Cracking the Coding Interview
 * @author liujian
 * 
 * 1.6 Given an image represented by an NxN matrix, where each pixel in the image is 
 * 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 *
 */

public class ImageRotate {
	
	public static int[][] rotate(int[][] image){
		int n = image.length;
		int m = image[0].length;
		
		if(m != n) {
			throw new UnsupportedOperationException("The image is not NxN matrix.");
		}
		
		int[][] rotate = new int[n][n];  //Create a new 2-D array
		
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++){
				rotate[n-j-1][i] = image[i][j];
			}
		return rotate;
	}
	
	
	public static void rotate2(int[][] image){
		int temp ;
		int n = image.length;
		for(int i = 0; i < 1; i++){
			for(int j = i; j < n-1-i; j++){
				temp = image[j][i];
				image[j][i] = image[i][n-j-1];
				image[i][n-j-1] = image[n-j-1][n-i-1];
				image[n-j-1][n-i-1] = image[n-i-1][j];
				image[n-i-1][j] = temp;
			}
		}
	}
	
	public static void print(int[][] image){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(image[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	
	public static void main(String[] args) {
		int[][] image = new int[][]{
			{1,2,3},{4,5,6},{7,8,9}
		};
		
		rotate2(image);
		print(image);
	}

}
