//sum of 1st N numbers and printing sum of prime numbers

import java.io.*;
import java.util.*;

class sump
{
	public static void main(String args[])
	{
		int a=1;
		int b=10;
		int sum=0;
		int count=0;
		
		for(int i=a; i<=b; i++)
		{
			for(int j=1; j<=b; j++){
			if(i%j==0)
			{
				count++;
			}}
		if(count==2){
		System.out.print(i+" ");
		sum+=i;
		}
		count=0;
		}
		System.out.print(sum);
	}
}