//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//La   -

import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab06b
{
	public static void main( String args[] ) throws IOException
	{
		File data = new File("lab06b.dat");
		Scanner scan = new Scanner(data);
		ArrayList<VowelWord> list = new ArrayList<>();
		while(scan.hasNext()){
			list.add(new VowelWord(scan.nextLine()));
		}
		Collections.sort(list);
		for(VowelWord w : list){
			out.println(w);
		}
	}
}