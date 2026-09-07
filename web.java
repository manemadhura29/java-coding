import java.io.*;
import java.util.*;

class web
{
	public static void main(String args[])
	{
		String name="LLLVVPP";
		char data[]={'L','L','L','V','V','P','P'};
		String str=new String(data);
		int count=1;

		/*for(int i=0; i<data.length; i++)
		{
			System.out.print(data[i] +" ");
		}*/

		for(int i=0; i<data.length; i++)
		{
			
			
			for(int j=i+1; j<data.length; j++)	
			{
				if(data[i]==data[j])
				{
					count++;
					
				}
				else
				{
					break;
				}								
			}
			
		
		if(count>1)
		{
			System.out.print(data[i] + " " + count +" ");
		}
		/*else
		{
			System.out.print(data[i]);
		}*/
		i=i+count;
		}
		
	}
}