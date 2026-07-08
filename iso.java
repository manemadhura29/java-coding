import java.io.*;
import java.util.*;

class iso
{
	public static void main(String args[])
	{
		String s1=new String("aab");
		String s2=new String("xyz");
		int count1=0;
		int count2=0;		
		
		for(int i=0; i<s1.length()-1; i++)
		{
			if(s1.charAt(i) == s1.charAt(i+1))
			{
				count1++;
			}
			if(s2.charAt(i) == s2.charAt(i+1))
			{
				count2++;
			}

		if(count1 == count2)
		{
			System.out.print("True");
			count1=0;
			count2=0;
			break;
		}
		else
		{
			System.out.print("False");
			break;
		}
		}	
	}
}