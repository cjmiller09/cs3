//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab05b
{
	public static void main ( String[] args )
	{
		ListIteratorTest test = new ListIteratorTest("a b c a b c");
		test.replace("a","+");
		out.println(test + "\n");

		test.setTest("a b c d e f g h i j x x x x");
		test.replace("x","7");
		out.println(test + "\n");

		test.setTest("1 2 3 4 5 6 a b c a b c");
		test.replace("b","#");
		out.println(test + "\n");
	}
}
