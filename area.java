//TO find max area of rectangle of histogram

import java.io.*;
import java.util.*;

class area
{
	public static void main(String args[])
	{
		int height[]={2,1,5,6,2,3};
		int x=0;
		int diff_a=0;
		int diff_b=0;
		int width=1;
		int rect=0;

		for(int i=0; i<height.length; i++)
		{
			for(int j=i+1; j<height.length; j++)
			{
				if(height[i] > height[j])
				{
					x=i;
					break;
				}
			}
		}
		System.out.println(x);

		for(int i=x; i<x+1; i++)
		{
			for(int j=i+1; j<i+2; j++)
			{
				diff_a=height[i]-height[j];
			}
			for(int k=i-1; k<x; k++)
			{
				diff_b=height[i]-height[k];
			}

		}

		System.out.println(diff_a);
		System.out.println(diff_b);
		if(diff_a > diff_b)
		{
			width++;
		}
		rect=height[x-1]*width;
		System.out.println(rect);

	}
}