import java.util.ArrayList;
import java.util.*;

class dupp
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<>();

		list.add("1");
		list.add("3");
		list.add("2");
		list.add("1");

		System.out.println(list);
		
		for(int i=0; i<list.size(); i++)
		{
			for(int j=i+1; j<list.size(); j++)
			{if(list.get(i).equals(list.get(j))){
			list.remove(i);
			System.out.print(list);}}
		}
		
	}
}