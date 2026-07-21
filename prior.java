//count the number of elements greater than 1st element print the count 

import java.io.*;
import java.util.*;

class prior
{
	public static void main(String args[])
	{
	int arr[]={7,4,8,2,9};
	int count=1;

	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]>arr[0])
		{
			count++;
		}
	}
	System.out.print(count);	
	}
}