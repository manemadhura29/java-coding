//LOCKER 

import java.io.*;
import java.util.*;

class locker
{
	public static void main(String args[])
	{
		int arr[]=new int[4];
		int sum=0;
		int count=0;

		System.out.println("Enter PIN : ");
		Scanner s=new Scanner(System.in);
		for(int i=0; i<4; i++)
		{
		arr[i]=s.nextInt();
		}
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}

		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]!=arr[j])
				{
					sum+=arr[i];
				}
			}
		}
		if(count==2 && sum%3==0)
		{
			System.out.print("Welcome....");
		}
		else
		{
			System.out.print("Locked");
		}
		
	}
}