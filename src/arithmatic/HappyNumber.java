package arithmatic;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/happy-number/
 * 
 * 
 * @author edwinanto
 *
 */

public class HappyNumber {
	
	public boolean isHappy(int n) 
    {
        int result = 0;
        Set<Integer> vals = new HashSet<Integer>();
        while (result != 1)
        {
        	result = 0;
            while (n > 0)
            {
                int val = n % 10;
                n = n/10;
                result += Math.pow(val,2);
            }
            if (vals.contains(result))
                return false;
            
            vals.add(result);
            n = result;
        }
       
        return true;       
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HappyNumber hn = new HappyNumber();
		
		System.out.println(hn.isHappy(19));

	}

}
