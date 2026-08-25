import java.io.*;
import java.util.*;

class cruise
{
	public static void main(String args[])
	{
		int a[]={7,0,5,1,3};
		int b[]={1,2,1,3,4};
		int result=0;
		int max=0;
	
		for(int i=0; i<a.length; i++)
		{
				result+=a[i];
				result-=b[i];
				//System.out.println(result);
				if(result>max)
				{
					max=result;
				}		
		}
		System.out.print(max);
	}
}