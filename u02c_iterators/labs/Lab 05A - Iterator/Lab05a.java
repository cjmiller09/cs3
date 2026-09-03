//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab05a
{
	public static void main ( String[] args )
	{
      ArrayList<String> test = new ArrayList<String>();
      Scanner scan = new Scanner("a b c a b c a");
      while(scan.hasNext()){
         test.add(scan.next());
      }
		IteratorTest.remove(test, "a");

      out.println();
      test.clear();

      scan = new Scanner("a b c d e f g h i j x x x x");
      while(scan.hasNext()){
         test.add(scan.next());
      }
      IteratorTest.remove(test, "x");
      
      out.println();
      test.clear();

      scan = new Scanner("1 2 3 4 5 6 a b c a b c");
      while(scan.hasNext()){
         test.add(scan.next());
      }
      IteratorTest.remove(test, "b");
      scan.close();
	}
}

