//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Grid
{
   private String[][] grid;

	public Grid()
	{
		this(0,0,new String[0]);
	}

	public Grid(int rows, int cols, String[] vals)
	{
		setGrid(rows,cols,vals);
	}
	
	public void setGrid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		int i=0;
		for(int r=0; r<grid.length; r++){
			for(int c=0; c<grid[r].length; c++){
				grid[r][c] = vals[i];
				i++;
			}
		}
	}

	public int findMax(String val)
	{
		int count=-1;
		return count;
	}

	private int findMax(int r, int c, String search)
	{
		return 0;
	}

	public String toString()
	{
		String output="";
		for(String[] row : grid){
			for(String col : row){
				output += col + " ";
			}
			output += "\n";
		}
		return output;
	}
}