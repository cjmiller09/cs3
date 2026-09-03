//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class MagicSquare
{
	private int[][] magicSquare;

	public MagicSquare()
	{
		setSize(0);
	}

	public MagicSquare(int size)
	{
      setSize(size);
	}
	
	public void setSize(int size)
	{
      magicSquare = new int[size][size];
	}

	public void createMagic()
	{
		int num = 1;
		magicSquare[0][magicSquare.length/2]= num;
      int r=0;
      int c=magicSquare.length/2;
      for(int i=0; i<Math.pow(magicSquare.length,2); i++){
         r-=1;
         c+=1;
         num+=1;
         if(r<0){r=magicSquare.length-1;}
         if(c>=magicSquare.length){c=0;}
         if(magicSquare[r][c] == 0){
            magicSquare[r][c] = num;

         }
         else{
            r+=1;
            if(r>=magicSquare.length){r=0;}
            magicSquare[r][c] = num;
         }
      }
      magicSquare[0][magicSquare.length/2]-=Math.pow(magicSquare.length,2);
   }
   

	public String toString( )
	{
      createMagic();
		String output="";
      for(int r=0; r<magicSquare.length; r++){
         for(int c=0; c<magicSquare.length; c++){
            output += magicSquare[r][c] + " ";
         }
         output += "\n";
      }
		return output;
	}
}

