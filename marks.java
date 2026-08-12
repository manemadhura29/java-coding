import java.util.*;

class marks
{
	public static void main(String args[])
	{
		int a[][]={{60,70,80}, {40,50,60}, {30,40,50}};
		//int a[][]={{55,60,45,50}, {20,30,40,50}};
		//int a[][]={{10,20,30,40,50}};
		int r=3;
		int c=3;
		int count=0;

		for(int i=0; i<a.length; i++)
		{
			int sum=0;
			double avg=0;
			for(int j=0; j<a[0].length; j++)
			{
				sum+=a[i][j];
			}
			avg=sum/c;
		if(avg>=50)
		{
			count++;
		}
		}
		
		System.out.print(count);
	}
}