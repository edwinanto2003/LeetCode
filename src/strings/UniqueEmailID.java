package strings;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailID {
	
	public String parse(String s) throws IllegalArgumentException
    {
        String[] emailParts = s.split("@");
        
        if (emailParts.length >2)
            throw new IllegalArgumentException("Invalid email");
        
        String name = emailParts[0];
        String domainName = emailParts[1];
        
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < name.length())
        {
            if (name.charAt(index) != '.')
                sb.append(name.charAt(index));
            if (name.charAt(index) == '+')
                break;
            
            index++;
        }
        
        sb.append('@');
        sb.append(domainName);
        return sb.toString();
    }
    
    
    public int numUniqueEmails(String[] emails) 
    {
        if (emails.length == 0)
            return 0;
        
        Set<String> uniqueEmails = new HashSet<String>();
        
        for (String s : emails)
        {
            uniqueEmails.add(parse(s));
        }
        
        return uniqueEmails.size();
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
