//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.IOException;

public class Lab09c
{
	public static void main( String args[] ) throws IOException
	{
		String[] vowels = {"A", "E", "I", "O", "U"};
		String[] vals = new String[144];
		for(int i=0; i<vals.length; i++){
			vals[i] = vowels[(int)(Math.random()*vowels.length)];
		}
		Grid test = new Grid(12,12,vals);
		System.out.println(test);
		System.out.println("A count = " + test.findMax("A"));
		System.out.println("E count = " + test.findMax("E"));
		System.out.println("I count = " + test.findMax("I"));
		System.out.println("O count = " + test.findMax("O"));
		System.out.println("U count = " + test.findMax("U"));
	}
}