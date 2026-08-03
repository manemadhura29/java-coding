import java.util.*;

class sg
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String g=s.nextLine();   //here string value is entered
		
		Scanner sc=new Scanner(System.in);
		int position=sc.nextInt();  //here postion is entered whose value need to be known

		int index=position-1;
		char ch=g.charAt(index);  //this will parse over string at specific index spefified as above by position and that single element is stored in ch of char datatype variale

		System.out.print(ch);  //this will print the index value whose value need to know
	}
}