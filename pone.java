import java.io.*;
import java.util.*;

class pone
{
	public static void main(String args[])
	{
		int digits[]={9};
		
		for(int i=0; i<digits.length; i++)
		{
			if(i==(digits.length-1))
			{
				digits[i]=digits[i]+1;
			}
		System.out.print(digits[i] +" ");
		}
	}
}