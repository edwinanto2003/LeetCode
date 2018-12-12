import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public int lengthOfLongestSubstring(String s) 
	{
		Set<Character> charSet = new HashSet<Character>();
		int curMax = 0;
		int max = 0;
		char[] sChar = s.toCharArray();
		for (int i = 0; i < sChar.length; i++)
		{
			if (charSet.contains(sChar[i]) == false)
			{
				charSet.add(sChar[i]);
				curMax++;
			}
			else
			{
				max = curMax > max ? curMax : max;
				charSet.clear();
				curMax = 1;
				charSet.add(sChar[i]);
			}
		}

		return max;
	}
	
	public int lengthofLongestSubstringCorrect(String s)
	{
		Set<Character> charSet = new HashSet<Character>();
		int ans = 0, i = 0, j = 0;
		
		while (i < s.length() && j < s.length())
		{
			if (!charSet.contains(s.charAt(j)))
			{
				charSet.add(s.charAt(j));
				j++;
				ans = ans > (j - i) ? ans : (j-i);
			}
			else
			{
				charSet.remove(s.charAt(i));
				i++;
			}
		}
		return ans;
 	}
	
	public static void main(String[] args) 
	{
		LongestSubstring ls = new LongestSubstring();
		System.out.println(ls.lengthofLongestSubstringCorrect("pwwkew"));
	}

}
