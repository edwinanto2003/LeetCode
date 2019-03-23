package arrays;


/**
 * #832 Flipping an image
 * 
 * Example 1:
	
	Input: [[1,1,0],[1,0,1],[0,0,0]]
	Output: [[1,0,0],[0,1,0],[1,1,1]]
	Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
	Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 * 
 * @author edwinanto
 *
 */
public class FlipImage {
	
	
	 public void reverse(int[][] A)
	    {
	        for (int row = 0; row < A.length; row++)
	        { 
	            int end = A[0].length - 1;
	            for (int col = 0; col < end; col++)
	            {
	                int temp = A[row][col];
	                A[row][col] = A[row][end];
	                A[row][end] = temp;
	                end--;
	            }
	        }            
	    }
	    
	    public void flip(int[][] A)
	    {
	        for (int j = 0; j < A[0].length; j++)
	        { 
	            for (int i = 0; i < A.length; i++)
	            {
	                A[i][j] = A[i][j] ^ 1;
	            }
	        }     
	    }
	    
	    public int[][] flipAndInvertImage(int[][] A) 
	    {
	        
	        if (A == null || A.length == 0)
	            throw new IllegalArgumentException("Illegal input");
	        
	        reverse(A);
	        flip(A);
	        
	        return A;
	    }
	public static void main(String[] args) 
	{
		int[][] A = {
				{1,1,0},
				{1,0,1},
				{0,0,0}
		};
	
		FlipImage fi = new FlipImage();
		
		fi.flipAndInvertImage(A);
		
		System.out.println();
		
	}

}
