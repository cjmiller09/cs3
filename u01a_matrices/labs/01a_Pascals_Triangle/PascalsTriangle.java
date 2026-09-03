//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class PascalsTriangle
{
	private int[][] mat;

	public PascalsTriangle()
	{
      this(0);
	}

	public PascalsTriangle(int size)
	{
      mat = new int[size][size];
	}

	public void createTriangle()
	{
      for(int r=0; r<mat.length; r++){
         for(int c=0; c<r; c++){
            if(r>0 && c>0){
               mat[r][c] = mat[r-1][c-1] + mat[r-1][c];
            }
            else{
               mat[r][c] = 1;
            }
         }
      }
	}

	public String toString()
	{
      createTriangle();
		String output="";
      for(int r=0; r<mat.length; r++){
         for(int c=0; c<r; c++){
            output += mat[r][c] + " ";
         }
         output += "\n";
      }
		return output;
	}
}

