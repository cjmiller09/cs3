//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
import java.util.Scanner;

public class Lab01a
{
	public static void main( String args[] ) throws IOException
	{
		//add code and test cases here
      File data = new File("u01a_matrices/labs/01a_Pascals_Triangle/lab01a.dat");
      Scanner scan = new Scanner(data);
      int size = scan.nextInt();
      PascalsTriangle p = new PascalsTriangle();
      for(int i=0; i<size; i++){
         scan.nextLine();
         p = new PascalsTriangle(scan.nextInt() + 1);
         out.println(p);
      }
      
	}
}

