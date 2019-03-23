package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate {
	
	public boolean containsDuplicate(int[] nums) 
    {
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length; i++)
        {
            if (set.contains(nums[i]))
                return true;
            
            set.add(nums[i]);
        }
        
        return false;
    }
	
/**
 * 	https://leetcode.com/problems/contains-duplicate-ii/
 * 
 * @param nums
 * @param k
 * @return
 */
	public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            for (int j = i+1; j < nums.length; j++)
            {
                if ((nums[i] == nums[j]) && ((j - i ) <= k))
                    return true;
            }
        }
                    
        return false;
    }
	
	/**
	 * 	https://leetcode.com/problems/contains-duplicate-ii/
	 * 
	 * faster solution
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public boolean containsDuplicateFaster(int[] nums, int k)
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++)
		{
			Integer val = map.put(nums[i], i);
			
			if (val != null && (i - val) <= k)
				return true;
		}
		
		return false;
	}

	public static void main(String[] args) 
	{
		Duplicate d = new Duplicate();
		
		int[] nums = {99,99};
		System.out.println(d.containsNearbyDuplicate(nums, 2));

		System.out.println(d.containsDuplicateFaster(nums, 2));
	
	}

}
