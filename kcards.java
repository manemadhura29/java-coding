/*chosing k cards with max sum either from starting as well as ending and should be consecutive not from middle
  By using two pointer and sliding windo approach

import java.util.*;

class kcards
{
	public static void main(String args[])
	{
		int arr[]={6,2,3,4,7,2,1,7,1};
		int k=4;
		int maxsum=0;
		int lsum=0;
		int rsum=0;
		int n=arr.length;

		for(int i=0; i<=k-1; i++)
		{
			lsum+=arr[i];
			maxsum=lsum;
		}

		int rindex=n-1;
		for(int j=k-1; j>=0; j--)
		{
			
			lsum-=arr[j];
			rsum+=arr[rindex];
			rindex=rindex-1;
			maxsum=Math.max(maxsum,lsum+rsum);
		}
		System.out.print(maxsum);
	}
}