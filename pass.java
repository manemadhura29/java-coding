//Finding the number of students who are passed if their avg is >=50 

import java.util.*;

class pass
{
	public static void main(String args[])
	{
		int a[][]={{60,70,80}, {40,50,60}, {30,40,50}};
		int count=0;

		for(int i=0; i<a.length; i++)
		{
			int sum=0;
			double avg=0;
			for(int j=0; j<a[0].length; j++)
			{
				sum+=a[i][j];
			}
			avg=sum/a[0].length;
			//System.out.println(sum);
			//System.out.println(avg);

			if(avg>=50)
			{
				count++;
			}
		}
		System.out.print(count);
	}
}