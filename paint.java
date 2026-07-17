//finding min from each row of matrix and check sum of mins is exceeds the given budget or not and simply print the sum or -1

import java.io.*;
import java.util.*;

class paint
{
	public static void main(String args[])
	{
		int c[][]={{3,4},
			   {4,5},
			   {2,6},
			   {3,2}};
		int b=5;
		int sum=0;

		for(int i=0; i<c.length; i++)
		{
			int min=c[i][0];
			int index=0;
			for(int j=1; j<c[i].length; j++)
			{
			if(c[i][j]<min)
			{
				min=c[i][j];
				index=j;
			}
			}
		System.out.println("Min "+min);
		System.out.println("Index column " +index);
		sum+=min;		
		}
		if(sum<b)
		{
			System.out.print(sum);
		}
		else
		{
			System.out.print("-1");
		}
	}
}