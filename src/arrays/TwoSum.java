package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) 
	{
		for(int i = 0; i < nums.length - 1; i++)
		{
			for (int j = i + 1; j < nums.length; j ++)
			{
				if ((nums[i] + nums[j]) == target)
				{
					return new int[]{i,j};
				}
			}
		}

		return null;
	}

	public int[] twoSumBetter(int[] nums, int target) 
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++)
		{
			map.put(nums[i], i);
		}
		
		// x + y = target   3 + 4 = 7
		for (int i = 0; i < nums.length; i++)
		{
			if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i]))
			{
				return new int[]{i, map.get(target - nums[i])};
			}
		}
		
		
		
		return null;
	}

	public static void main(String[] args) 
	{
		TwoSum ts = new TwoSum();
		
		int[] a = new int[] {2,7,9,11};		
		int target = 9;
		
		int[] res = ts.twoSumBetter(a, target);
		System.out.println();
	}

}
