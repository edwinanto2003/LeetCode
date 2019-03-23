package arithmatic;

public class ReverseInt {

	public int reverse(int x) 
    {
        int result = 0;
        boolean neg = false;
        
        if (x < 0)
            neg = true; 
       
        x = Math.abs(x);
        while (x>0)
        {
            int rem = x%10;
            x = x/10;
            
            if (result > (Integer.MAX_VALUE)/10)
            	return 0;
            
            result = result *10 + rem;
        }
        
            return  (neg) ? (-1*result): result ;
    }
	
	public static void main(String[] args) 
	{
	
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverse(1534236469));
	}

}
