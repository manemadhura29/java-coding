//Count the number of * and # and check the count and simply print -1 or +1 or 0

import java.io.*;
import java.util.*;

class valid
{
	public static void main(String []args)
	{
		String str="###***";
		int count1=0;
		int count2=0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='*')
			{
				count1++;
			}
			else
			{
				count2++;
			}
		
		}
		System.out.println("* = "+count1);
		System.out.println("# = "+count2);

		if(count1>count2)
		{
			System.out.print("1");
		}
		else if(count1<count2)
		{
			System.out.print("-1");

		}
		else
		{
			System.out.print("0");

		}

	}
}