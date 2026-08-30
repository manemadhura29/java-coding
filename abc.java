//finds first occurance of sustring in main string 
import java.util.*;

class abc
{
	public static void main(String args[])
	{
		//String a="leetcode";
		String a="sadbutsad";
		//String b="leeto";
		String b="sad";

		if(a.contains(b))
		{
			char ch=b.charAt(0);
			int x=a.indexOf(ch);
			System.out.print(x);
		}
		else
			System.out.print("-1");
	}
}