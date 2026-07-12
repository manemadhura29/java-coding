import java.io.*;
import java.util.*;

class sort
{
	public static void main(String []args)
	{
		int a[]={1,4,6,9,15};
		int b[]={2,5,8,10};
		int temp[]=new int[a.length+b.length];
		int t=0;

		for(int i=0; i<a.length; i++)
		{
			temp[i]=a[i];
				
		}
		for(int j=0; j<b.length; j++)
		{
			temp[a.length+j]=b[j];
		}
		for(int i=0; i<temp.length; i++)
		{
			System.out.print(temp[i] +" ");
		}
		System.out.println();

		for(int i=0; i<temp.length; i++)
		{
			for(int j=i+1; j<temp.length; j++)
			{
				if(temp[i]>temp[j])
				{
					t=temp[i];
					temp[i]=temp[j];
					temp[j]=t;
				}
			}
			System.out.print(temp[i] +" ");

		}
	}
}