package strings;

public class ReverseStrings {

	

	private void reverse(char[] s, int start, int end) 
	{	
		while (start < end)
		{
			s[start] ^= s[end];
			s[end] ^= s[start];
			s[start] ^= s[end];
			start++;
			end--;
		}		
	}
	
	private void reverseWords(char[] s)
	{
		int start = 0;
		int end = s.length -1;
		reverse(s, start, end);
		int index = 0;
		
		while (index <= end )
		{
			if (s[index] == ' ')
			{
				reverse(s, start, index - 1);
				start = index + 1;
			}
			else if (index == end)
			{
				reverse(s, start, end);
			}
			index++;
		}	
		
	}

	
	public static void main(String[] args) 
	{
		//char[] s = new char[]{'H','e','l','l','o',' ','w','o','r','l','d'};
		char[] s = new char[]{'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
		
		ReverseStrings rs = new ReverseStrings();
		//rs.reverse(s);
		rs.reverseWords(s);
		System.out.println(s);
	}
}
