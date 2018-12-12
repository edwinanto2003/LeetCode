package geekForGeeks;

/**
 * 	https://www.geeksforgeeks.org/function-copy-string-iterative-recursive/
 * 
 * @author edwinanto
 *
 */
public class FunctionCopy {
	
	public void myCopy(char s1[], char s2[], int index)
	{
		if (index == s1.length)
			return;
		
		s2[index] = s1[index];
		myCopy(s1, s2, index + 1);
		
	}

	public static void main(String[] args) 
	{
		FunctionCopy fc = new FunctionCopy();
		char[] s1 = new char[]{'G','E','E','K','F','O','R','G','E','E','K','S'};
		char[] s2 = new char[]{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
		fc.myCopy(s1, s2, 0);
		System.out.println(s2);
	}

}
