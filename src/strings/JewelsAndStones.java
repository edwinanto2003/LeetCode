package strings;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

	  public int numJewelsInStones(String J, String S) 
	    {
	        Set<Character> jSet = new HashSet<Character>();
	        int count = 0;
	        
	        for (int i = 0; i < J.length(); i++)
	            jSet.add(J.charAt(i));
	        
	        for (int i = 0; i < S.length(); i++)
	        {
	            if (jSet.contains(S.charAt(i)))
	                count++;
	        }
	        
	        return count;
	    }
	  
	public static void main(String[] args) 
	{
		String J = "aA";
		String S = "aAAbbbb";
		
		JewelsAndStones js = new  JewelsAndStones();
		
		System.out.println(js.numJewelsInStones(J, S));
	
	}

}
