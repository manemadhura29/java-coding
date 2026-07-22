//Finding missing integer from given 1 to N series of natural numbers

import java.io.*;
import java.util.*;

class dist
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,5};
		int a=0;
	
		for(int i=0; i<arr.length-1; i++)
		{
			a=arr[i]+1;
			if(a!=arr[i+1])
			{
				System.out.println(a);
			}
		}
	}
}