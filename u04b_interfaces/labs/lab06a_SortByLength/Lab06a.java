//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab06a
{
	public static void main( String args[] ) throws IOException
	{
		ArrayList<Word> words = new ArrayList<>();
		File data = new File("lab06a.dat");
		Scanner scan = new Scanner(data);
		while(scan.hasNext()){
			words.add(new Word(scan.nextLine()));
		}
		Collections.sort(words);
		for(Word w : words){
			out.println(w);
		}
	}
}