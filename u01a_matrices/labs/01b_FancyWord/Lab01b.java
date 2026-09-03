//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

// Only works in JGRASP

import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
import java.util.Scanner;

public class Lab01b
{
	public static void main( String args[] ) throws IOException
	{
		File data = new File("lab01b.dat");
      Scanner scan = new Scanner(data);
      int size = scan.nextInt();
      scan.nextLine();
      FancyWord word = new FancyWord();
      for(int i=0; i<size; i++){
         word = new FancyWord(scan.nextLine());
         out.println(word);
      }
	}
}

