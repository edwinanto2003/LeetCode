import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArray {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        Map<String,Integer> input = new HashMap<String,Integer>();
	        for (int i = 0 ; i < n ; i++)
	        {
	            String key = sc.next();
	            if(input.containsKey(key))
	            {
	                input.put(key, input.get(key) + 1);
	            }
	            else
	            {
	                input.put(key, 1);
	            }
	        }
	        
	        int qN = sc.nextInt();
	        String[] queries  = new String[qN];
	        
	        for(int i = 0; i < qN; i++)
	        {
	            queries[i] = sc.next();
	        }
	        
	        for (int i = 0; i < qN; i++)
	        {
	            String key = queries[i];
	            if(input.containsKey(key) == false)
	                System.out.println(0);
	            else
	                System.out.println(input.get(key));
	        }
	        
	        sc.close();
	}

}
