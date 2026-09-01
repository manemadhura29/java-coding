//Next Smallest Element at left

import java.util.*;
import java.util.Stack;

class nse_1
{
	public static void main(String args[])
	{
		int arr[]={4,5,2,10,8};
		int n=arr.length;
		int nse[]=new int[n];
		Stack<Integer> st=new Stack<>();
		
		for(int i=0; i<n; i++)
		{
			
			while(!st.empty() && st.peek() >= arr[i])
			{
				st.pop();
			}
			if(st.empty())
			{
				nse[i]=-1;
			}
			else
			{
				nse[i]=st.peek();
			}
			st.push(arr[i]);
		System.out.print(nse[i] +" ");
		}
	}
}