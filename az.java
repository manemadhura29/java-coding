//Finding kth element from array which is in descending order

import java.io.*;
import java.util.*;

class az
{
	public static void main(String args[])
	{
		int n[]={15,25,10,40,30};
		int k=2;
		int temp=0;

		for(int i=0; i<n.length; i++)
		{
			for(int j=i+1; j<n.length; j++)
			{
				if(n[i] < n[j]){
				temp=n[i];
				n[i]=n[j];
				n[j]=temp;}
			}
		System.out.print(n[i] +" ");
		}
		for(int i=0; i<n.length; i++)
		{
			if(i==(k-1)){
			System.out.println();
			System.out.print(n[i]);}
		}
	}
}