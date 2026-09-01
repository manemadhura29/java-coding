//Next Greater Element - 1
//jsut search for next greater element upto end of array

import java.util.*;
import java.util.Stack;
import java.util.Arrays;	

class nge_1
{
	public static void main(String args[])
	{
	int arr[]={6,1,8,1,3};
	int n=arr.length;
	int nge[]=new int[n];
	Stack<Integer> st=new Stack<>();

	

	for(int i=n-1; i>=0; i--)
	{
		while(!st.empty() && st.peek() <= arr[i])
		{
			st.pop();
		}
		if(st.empty())
		{
			nge[i]=-1;
		}
		else
		{
			nge[i]=st.peek();
		}
		st.push(arr[i]);
		//System.out.print(nge[] +" ");
	}
		System.out.print(Arrays.toString(nge));
	
	}
}