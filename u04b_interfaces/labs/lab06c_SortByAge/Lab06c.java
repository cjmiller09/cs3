//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class Lab06c
{
	public static void main ( String[] args ) throws IOException
	{
	   File file = new File("lab06c.dat");
	   Scanner scan = new Scanner(file);
	   ArrayList<Person> people = new ArrayList<>();
	   int size = scan.nextInt();
	   for(int i=0; i<size; i++){
		scan.nextLine();
		int year = scan.nextInt();
		int month = scan.nextInt();
		int day = scan.nextInt();
		String name = scan.next();
		people.add(new Person(year, month, day, name));
	   }
	   Collections.sort(people);
	   for(Person p : people){
		out.println(p);
	   }
	}
}