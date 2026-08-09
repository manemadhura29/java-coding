//Max subarray of one's by flipping k zero's
//Using two pointer and slidding window approach 

import java.util.*;

class max_len_one
{
	public static void main(String args[])
	{
		int arr[]={1,1,1,0,0,0,0,1,1,1,1,1,0};
		int k=2;
		int count=0;
		int len=0;
		int j=0;
		int i=0;
		int maxlen=0;
		
		while(i < arr.length)
		{
			if(arr[i]==0)
			{
				count++;
			}
			
			if(count > k)
			{
				if(arr[j]==0){
				count--;
				}
				j++;
			}
			else if(count <= k)
			{
				len=i-j+1;
				maxlen=Math.max(len,maxlen);
			}
		i++;
		}

		System.out.print(maxlen);
	}
}