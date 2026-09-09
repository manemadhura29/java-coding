//Array is nothing bt stock's and person has to buy any one stock at once only and can sell later day with max profit max profit gets printed

import java.util.*;

class stock
{
	public static void main(String args[])
	{
		//int arr[]={6,7,1,5,3,6,4};
		int arr[]={5,7,6,4,3,1};
		int a=0;
		int max=0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] < arr[j]){
				a=arr[j]-arr[i];
				max=Math.max(a,max);}
				//System.out.println(a);
			
			}	
			
		}
	System.out.print(max);
	}
}
