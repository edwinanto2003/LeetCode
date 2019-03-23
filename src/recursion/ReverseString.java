package recursion;

public class ReverseString {
	
	private void reverse(char[] str)
	{
		helper(0, str.length - 1, str);
	}

	private void helper (int start, int end, char[] str)
	{
		if (str == null || (start >= end))
			return;
		
		helper (start + 1, end -1, str);
		
		char temp = str[start];
		str[start] = str[end];
		str[end] = temp;		
	}
	
	public static void main(String[] args) 
	{
		String s = "abcdefghij";
		char[] input = s.toCharArray();
		ReverseString rs = new ReverseString();
		rs.reverse(input);
		System.out.println(input);
	}

}
