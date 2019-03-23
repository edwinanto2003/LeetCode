package arrays;


/**
 * #905 https://leetcode.com/problems/sort-array-by-parity/
 * 
 * 
 *      Example 1:
 *
 *		Input: [3,1,2,4]
 *		Output: [2,4,3,1]
 *		The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * 
 * 
 * 
 * 
 * @author edwinanto
 *
 */
public class SortArraysByPArity {

	public void swap (int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    
    public int[] sortArrayByParity(int[] A) 
    {
        int i = 0, j = A.length - 1;
        
        while (i < j)
        {
            while (i< j && A[i] % 2 == 0)
                i++;
            while (i < j && A[j] % 2 != 0)
                j--;
            
            if (i < j)
            {
                swap(A,i,j); 
                i++; 
                j--;
            }
        }
        
        return A;
    }
	
	public static void main(String[] args) 
	{
		int[] A = new int[]{0,2};
		SortArraysByPArity spa = new SortArraysByPArity();
		spa.sortArrayByParity(A);
		System.out.println();

	}

}
