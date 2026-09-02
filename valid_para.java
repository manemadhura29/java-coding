import java.util.*;
import java.util.Stack;

class valid_para
{
	public static void main(String args[])
	{
		String s="()[{}()]";
		Stack<Character> st=new Stack<>();
	
		for(int i=0; i<s.length(); i++)
		{
			char c=s.charAt(i);
			if(c=='(' || c=='[' || c=='{')
			{
				st.push(c);
				System.out.println(st);
			}
			else if(c==')' || c==']' || c=='}')
			{
				
				if(st.empty())
				{
					System.out.println("At last so true");
					return;
				}

				else
				{
					char top=st.peek();
					
					if(c==')' && top=='(' || c==']' && top=='[' || c=='}' && top=='{')
					{
						System.out.println("True");
					}
				}
			}
		st.pop();
		}
		
	}	
}