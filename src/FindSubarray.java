
public class FindSubarray 
{
	public int findUnsortedSubarray(int[] nums) 
	{
		int i = 0; 
		int j = nums.length - 1;

		while (i < j)
		{
			if ((nums[i] >= nums[i+1]) && (nums[j] <= nums[j-1]))
				break;

			if (nums[i] < nums[i+1])
				i++;

			if (nums[j] > nums[j-1])
				j--;

		}
		return j - i + 1;
	}

	public static void main(String[] args) 
	{
		FindSubarray fsa = new FindSubarray();
		int[] test = {1,2,3,3,3};
		System.out.println(fsa.findUnsortedSubarray(test));
	}
}
