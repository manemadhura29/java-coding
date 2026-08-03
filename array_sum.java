import java.util.*;

class array_sum
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num[]=new int[n];
		int sum=0;

		for(int i=0; i<num.length; i++)
		{
			Scanner sc=new Scanner(System.in);
			num[i]=sc.nextInt();
		}
		for(int arr:num)
		{
			System.out.print(arr +" ");
			sum+=arr;
		}
		System.out.println();
		System.out.print(sum);
	}
}