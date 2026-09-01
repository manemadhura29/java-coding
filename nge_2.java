//Next Greatest Element -2
//similer to NGE-1 bt the only diff is it checks NGE circularly while NGE-1 search's upto the end of the array only

import java.util.*;
import java.util.Stack;

class nge_2
{
	public static void main(String args[])
	{
	int arr[]={2,10,12,1,11};
	int n=arr.length;
	int nge[]=new int[n];
	Stack<Integer> st=new Stack<>();

	for(int i=2*n-1; i>=0; i--)
	{
		while(!st.empty() && st.peek() <= arr[i%n])
		{
			st.pop();
		}
		if(i<n)
		{
			if(st.empty())
			{
				nge[i]=-1;
			}
			else
			{
				nge[i]=st.peek();
			}
		}
		st.push(arr[i%n]);
	}
	for(int i=0; i<n; i++)
	{
		System.out.print(nge[i] +" ");
	}
	}
}