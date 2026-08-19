//Check weather the given series of numbers includes any prime number if yes then again check sum of digits of prime number is also a prime number or not 

import java.io.*;
import java.util.*;

class primenum
{
	public static void main(String args[])
	{
	int nn=20;
	int mm=25;
	int count=0;
	int n=0;
	int a=0;
	int b=0;
	int sum=0;
	

	for(int i=nn; i<=mm; i++)
	{
		for(int j=1; j<=mm; j++)
		{
			if(i%j == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			
			System.out.println(i);
			n=i;
		}
		else
		{
			System.out.println("Not prime");
		}
	count=0;
	}

		a=n%10;
		b=n/10;
		sum=a+b;
		System.out.println(sum);

		for(int i=sum; i<=sum; i++)
		{	
			count=0;
			for(int j=1; j<=sum; j++)
			{
				if(i%j == 0)
				{
					count++;
				}
			}
		if(count == 2)
		{
			System.out.print("It's also a prime number");
		}
		else
		{
			System.out.print("It's not a prime number");
		}

		}
	}
}