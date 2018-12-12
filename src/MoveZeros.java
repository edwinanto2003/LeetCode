
public class MoveZeros 
{
	private void move(int[] nums)
	{
		int nZI = 0, c = 0;
		
		while (c < nums.length)
		{
			if (nums[c] != 0)
			{
				nums[nZI] = nums[c];
				if (nZI < c)
					nums[c] = 0;
				nZI++;
			}
		}
	}

	public static void main(String[] args) 
	{
		MoveZeros mz = new MoveZeros();
		int[] nums = new int[]{2,3,0,1,0,0,5,6};
		mz.move(nums);
		System.out.println(nums);
	}

}
