//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
      this(null,null);
	}

	public Histogram(char[] values, String fName)
	{
      fileName = fName;
      count = new ArrayList<Integer>();
      letters = new ArrayList<Character>();
      for(int i=0; i<values.length; i++){
         letters.add(values[i]);
         count.add(0);
      }
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
      File data = new File(fileName);
      Scanner scan = new Scanner(data);
      String word;
      while(scan.hasNext()){
         word = scan.next();
         for(int i=0; i<word.length(); i++){
            if(letters.contains(word.charAt(i))){
               int num = count.get(letters.indexOf(word.charAt(i)));
               num++;
               count.set(letters.indexOf(word.charAt(i)), num);
            }
         }
      }
	}

	public char mostFrequent()
	{
      int big = 0;
      for(int i=0; i<count.size(); i++){
         if(count.get(i) > big){
            big = count.get(i);
         }
      }
		return letters.get(count.indexOf(big));
	}

	public char leastFrequent()
	{
      int small = Integer.MAX_VALUE;
      for(int i=0; i<count.size(); i++){
         if(count.get(i) < small){
            small = count.get(i);
         }
      }
		return letters.get(count.indexOf(small));
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}
