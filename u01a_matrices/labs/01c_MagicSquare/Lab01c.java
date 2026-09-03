//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab01c
{
	public static void main( String args[] ) throws IOException
	{
		File data = new File("lab01c.dat");
      Scanner scan = new Scanner(data);
      int size = scan.nextInt();
      scan.nextLine();
      MagicSquare s = new MagicSquare();
      for(int i=0; i<size; i++){
         s = new MagicSquare(scan.nextInt());
         scan.nextLine();
         out.println(s);
      }
	}
}

