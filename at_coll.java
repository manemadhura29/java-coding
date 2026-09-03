//Atsoroid collision
//if num is +ve then it will go righword and if the num is -ve it will go leftword and while doing so is num gets colloid then that operation must be //performed as per the condion

import java.util.*;
import java.util.Stack;

class at_coll
{
	public static void main(String args[])
	{
		int arr[]={4,7,1,1,2,-3,-7,17,15,-16};
		Stack<Integer> st=new Stack<>();

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > 0)
			{
				st.push(arr[i]);
			}
			else 
			{
				while(!st.empty() && st.peek() > 0 && st.peek() < Math.abs(arr[i]))
				{
					st.pop();
				}
				if(!st.empty() && st.peek() == Math.abs(arr[i]))
				{
					st.pop();
				}
				else if(st.empty() || st.peek() < 0)
				{
					st.push(arr[i]);
				}				
			}
		
		
		}
	System.out.print(st);
	}
}