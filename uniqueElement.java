import java.util.*;

class uniqueElement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String arr[]=sc.nextLine().split(" ");
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
	
		for(int i=0; i<arr.length; i++) //or by for each loop for(int i:arr)  and then while parsing it simply give i
		{
			int n=Integer.parseInt(arr[i]);
			set.add(n);
		}
		System.out.print(set);
	}
}