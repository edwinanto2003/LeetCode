package strings;

/**
 * https://leetcode.com/problems/to-lower-case/description/
 * @author edwinanto
 *
 */
public class ToLower {
	
	/*
	public String toLowerCase(String str) 
    {
        char[] a = str.toCharArray();
        
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] >= 'A' && a[i] <= 'Z')
            {
                a[i] = (char)(a[i] - 'A' + 'a');
            }
        }
        return new String(a);
    }
	
	*/
    public String toLowerCase(String str) 
    {
        char[] strChar = str.toCharArray();
        
        for (int i = 0 ; i < strChar.length; i++)
        {
            char c = strChar[i];
            if (Character.isLetter(c))
            {
                if (c >= 'A' && c <= 'Z')
                {
                    strChar[i] -= (char)('A' - 'a');
                }
            }
        }
        
        return new String(strChar);
    }
    
	public static void main(String[] args) 
	{
		ToLower tl = new ToLower();
		System.out.println(tl.toLowerCase("Hello"));
	
	}

}
