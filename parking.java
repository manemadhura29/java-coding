//Finding index of row which maximum number of 1's 


import java.util.*;

class parking
{
	public static void main(String args[])
	{
		int a[][]={{0,1,0}, {1,1,0}, {1,1,1}};
		int n=0;
		int max=0;

		for(int i=0; i<a.length; i++)
		{
			int count=0;
			
			for(int j=0; j<a[0].length; j++)
			{
				if(a[i][j]==1)
				{
					count++;
				}
			}
		if(count > max)
		{
			max=count;
			n=i+1;
		}
		}
		System.out.print(n);
	}		
}