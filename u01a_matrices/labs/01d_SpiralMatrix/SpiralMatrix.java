//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class SpiralMatrix
{
	//define a matrix
   private int[][] mat;

	public SpiralMatrix()
	{
      this(0);
	}

	public SpiralMatrix(int size)
	{
      setSize(size);
	}
	
	public void setSize(int size)
	{
      mat = new int[size][size];
	}

	public void createSpiral()
	{
      int num = 1;
      int r=0;
      int c=0;
      int x=0;
      while(num < Math.pow(mat.length,2)){
         for(r=0; r<mat.length-x;r++){
            mat[r][c] = num;
            num++;
         }
         if(r>=mat.length){r--;}
         for(c=0; c<mat[r].length-x;c++){
            mat[r][c] = num;
            num++;
         }
         if(c>=mat.length){c--;}
         for(r=mat.length-1;r>=0+x;r--){
            mat[r][c] = num;
            num++;
         }
         if(r<=0){r++;}
         for(c=mat[r].length-1;c>=1+x;c--){
            mat[r][c] = num;
            num++;
         }
         if(c<=0){c++;}
         x++;
      }
	}

	public String toString( )
	{
      createSpiral();
		String output="";
      for(int r=0; r<mat.length; r++){
         for(int c=0; c<mat[r].length; c++){
            output += mat[r][c] + " ";
         }
         output += "\n";
      }
		return output;
	}
}

