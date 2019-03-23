package strings;

public class kotak 
{
	/**
	 * abc abc/aa/{2,3} => abc abc/aa/2 abc abc/aa/3
	 * @param a
	 * @return
	 */
	private String parse(String a)
	{
		char[] aCharArr = a.toCharArray();
		StringBuilder result = new StringBuilder();
		int i= 0;
		while (aCharArr[i] != '{')
		{
			result.append(aCharArr[i]);
			i++;
		}
		String prefix = result.toString();
		
		i++;
		while(aCharArr[i] != '}')
		{
			if (aCharArr[i] == ',')
			{
				result.append(' ');
				result.append(prefix);
			} else
			{
				result.append(aCharArr[i]);
			}
			i++;
		}
		
		return result.toString();
	}

	public static void main(String[] args) 
	{
		String word = "abc aa/a/b/ab/{1,2,3,4}";
		kotak k = new kotak();
		
		System.out.println(k.parse(word));
	
	}
}
