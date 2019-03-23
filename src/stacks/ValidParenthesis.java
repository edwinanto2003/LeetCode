package stacks;

import java.util.Stack;

public class ValidParenthesis {

	/**
	 * 
	 * ([{    )]}
	 * 
	 * 
	 * @param s
	 * @return
	 */
	public boolean wellFormed(String s)
	{
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == '(')
				stack.push(')');
			else if (s.charAt(i) == '[')
				stack.push(']');
			else if (s.charAt(i) == '{')
				stack.push('}');
			else 
			{
				char c = stack.pop();
				
				if (s.charAt(i) == ')' && c != ')')
				{
					return false;
				}
				else if (s.charAt(i) == '[' && c != ']')
				{
					return false;
				}
				else if (s.charAt(i) == '{' && c!= '}')
				{
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		ValidParenthesis vp = new ValidParenthesis();

		System.out.println("([])[]({}) : well formed ? " + vp.wellFormed("([])[]({})"));
		System.out.println("([)] : well formed ? " + vp.wellFormed("([)]"));
		System.out.println("((() : well formed ? " + vp.wellFormed("((()"));		
	}
}
