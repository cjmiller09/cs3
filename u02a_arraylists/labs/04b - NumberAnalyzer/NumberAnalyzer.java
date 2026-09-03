//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	public NumberAnalyzer()
	{
		this("");
	}

	public NumberAnalyzer(String numbers)
	{
		setList(numbers);
	}
	
	public void setList(String numbers)
	{
		list = new ArrayList<Number>();
	  	Scanner scan = new Scanner(numbers);
	  	while(scan.hasNextInt()){
			list.add(new Number(scan.nextInt()));
	  	}
	}

	public int countOdds()
	{
      int oddCount=0;
		for(Number n : list){
		 if(n.isOdd()){
			oddCount++;
		 }
	  }

      return oddCount;
	}

	public int countEvens()
	{
    	int evenCount=0;
		for(Number n : list){
			if(!n.isOdd()){
				evenCount++;
			}
		}
	
    	return evenCount;
	}

	public int countPerfects()
	{
		int perfectCount=0;
		for(Number n : list){
			if(n.isPerfect()){
				perfectCount++;
			}
		}

    	return perfectCount;
	}
	
	public String toString( )
	{
		return list.toString();
	}
}
