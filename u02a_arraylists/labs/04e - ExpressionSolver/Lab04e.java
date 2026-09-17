//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
import java.util.Scanner;

public class Lab04e
{
	public static void main( String args[] ) throws IOException
	{
		File file = new File("lab04e.dat");
		Scanner scan = new Scanner(file);
		ExpressionSolver solver;
		while(scan.hasNextLine()){
			solver = new ExpressionSolver(scan.nextLine());
			solver.solveExpression();
			out.println(solver);
		}
	}
}
