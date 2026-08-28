import java.util.*;
import java.util.Arrays;

class Mean
{
	public static void main(String args[])
	{
		int a[]={1,2};
		int b[]={3,4};
		int n=a.length+b.length;
		int c[]=new int[n];
		double z=0.0;
		float sum=0.0f;

		for(int i=0; i<a.length; i++)
		{
			c[i]=a[i];
		}
		for(int i=0; i<b.length; i++)
		{
			c[a.length+i]=b[i];
		}
		Arrays.sort(c);
		if(n%2==0)
		{
			sum=c[n/2]+c[n/2-1];
			z=sum/2;
		}
		else
		{
			z=c[n/2];
		}
		System.out.print(z);	
	}
}