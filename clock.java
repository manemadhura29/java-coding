import java.util.*;

class clock
{
	public static void main(String args[])
	{
	String a="7:05:45PM";
	String parts[]=a.split(":");
	
	int hr=Integer.parseInt(parts[0]);
	String min=parts[1].substring(0,2);
	String sec=parts[2].substring(0,2);
	String period=parts[2].substring(0,2);

	if(period=="PM")
	{
		if(hr==12)
		{
			hr+=0;
		}
		else
		{
			hr+=12;
		}
	System.out.print(hr+":"+min+":"+sec);
	}
	if(hr==12)
	{
		hr=0;
		System.out.print(hr+":"+min+":"+sec);
	}
	
	}
}