//insert an element in an exixting array

import java.io.*;
import java.util.*;

class insert
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		int n=2;
		int x=25;
		int temp[]=new int[a.length+1];
		
		for(int i=0; i<n; i++)
		{
			temp[i]=a[i];
		}
			temp[n]=x;
		
		for(int i=n; i<a.length; i++)
		{	
			temp[i+1]=a[i];
			
		}

		for(int i=0; i<temp.length; i++)
		{
			System.out.print(temp[i] +" ");
		}
	}
}