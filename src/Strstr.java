
public class Strstr {

	public static int strstr(String s, String x) 
	{
	    for(int i =0; i < s.length();i++)
	    {
	        int j = 0;
	        int iCurrent = i;
	     
	        while(j < x.length())
	        {
	            if(s.charAt(iCurrent) == x.charAt(j))
	            {
	                if(j == x.length()-1)
	                    return i;

		            j++;
		            iCurrent++;
	            }else 
	            {
	                break;
	            }
	        }
	    }
	    
	    
	    return -1;

	}


	public static void main(String[] args) 
	{
		String s = "CodefightsIsAwesome";
		String x = "IsA";
		
		System.out.println(strstr(s, x));
	}

}
