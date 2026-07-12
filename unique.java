//Copy array A into an array B

import java.io.*;
import java.util.*;

class unique
{
	public static void main(String args[])
	{
		int a[]={1,2,3,5,1,5,20,2,12,10};
		int count=0;

		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
			if(a[i]==a[j])
			{
				count++;
			}}

		if(count==1)
		{
		System.out.print(a[i] +" ");
		}
		count=0;
		}
	}
}