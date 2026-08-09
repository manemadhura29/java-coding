//Longest substring without repeating characters find the length of substring
//Using two pointer and sliding window approach

import java.util.*;
import java.util.Arrays;

class non_reap
{
	public static void main(String args[])
	{
		String s[]={"c","a","d","b","z","a","d","b"};
		int hash[]=new int[256];
		Arrays.fill(hash,0);
		int len=0;
		int maxlen=0;
		
		for(int i=0; i<s.length; i++)
		{
			for(int j=i; j<s.length; j++)
			{
				if(hash[s[j].charAt(0)]==1)
				
					break;
				
				len=j-i+1;
				maxlen=Math.max(len,maxlen);
				hash[s[j].charAt(0)]=1;
			}
		}

		System.out.print(maxlen);
	}
}