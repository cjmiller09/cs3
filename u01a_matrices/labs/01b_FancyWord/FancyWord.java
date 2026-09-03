//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
		mat=new char[0][0];
	}

   public FancyWord(String word)
	{
      mat = new char[word.length()][word.length()];
      for(int i=0; i<word.length(); i++){
         mat[0][i] = word.charAt(i);
         mat[i][i] = word.charAt(i);
         mat[i][mat.length - i - 1] = word.charAt(word.length() - i - 1);
         mat[mat.length - 1][i] = word.charAt(i);
      }
	}

	public String toString()
	{
		String output="";
      for(int r=0; r<mat.length; r++){
         for(int c=0; c<mat[r].length; c++){
            output += mat[r][c];
         }
         output += "\n";
      }
		return output;
	}
}

