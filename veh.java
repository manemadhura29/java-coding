//U have given 'v'num of vehicals(2wheeler+4wheeler) and 'w'num of wheels then u have to find how many 2wheeler vehicles(tw) are there and how many 4wheeler vehicles(fw)

import java.io.*;
import java.util.*;

class veh
{
	public static void main(String args[])
	{
		int v=200;
		int w=540;
		int tw=0;
		int fw=0;

		if(v<w && w%2==0)
		{
			//v=tw+fw;
			//tw=v-fw;
			//w=tw*2+fw*4;
			fw=(w-(v*2))/2;
			tw=v-fw;
			v=tw+fw;			

			System.out.println(fw);
			System.out.println(tw);
			System.out.println(v);
			System.out.println(w);

		}
	}
}