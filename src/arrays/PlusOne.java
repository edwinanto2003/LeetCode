package arrays;

public class PlusOne {

	public int[] plusOne(int[] digits) 
    {
		int n = digits.length;
		
		for (int i = n -1; i>=0; i--)
		{
			if (digits[i] < 9)
			{
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		
		int[] result = new int[n+1];
		result[0] = 1;
		return result;
    }
	
	public static void main(String[] args) 
	{
		PlusOne po = new PlusOne();
		int[] result = po.plusOne(new int[]{9});
		for (int i = 0; i < result.length; i++)
			System.out.print( result[i]+ " ");
		

	}

}
