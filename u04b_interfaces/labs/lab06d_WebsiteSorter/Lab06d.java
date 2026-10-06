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

public class Lab06d
{
	public static void main ( String[] args ) throws IOException
	{
		File file = new File("lab06d.dat");
		Scanner scan = new Scanner(file);
		ArrayList<SiteName> sites = new ArrayList<>();
		int size = scan.nextInt();
		for(int i=0; i<size; i++){
			scan.nextLine();
			sites.add(new SiteName(scan.next()));
		}
		Collections.sort(sites);
		for(SiteName site : sites){
			out.println(site);
		}
	}
}
