//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Grid
{
   private String[][] grid;
   private boolean[][] visited;

	public Grid()
	{
		setGrid(0,0,new String[0]);
	}

	public Grid(int rows, int cols, String[] vals)
	{
		setGrid(rows,cols,vals);
	}
	
	public void setGrid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		visited = new boolean[rows][cols];
		int i=0;
		for(int r=0; r<grid.length; r++){
			for(int c=0; c<grid[r].length; c++){
				grid[r][c] = vals[i];
				visited[r][c] = false;
				i++;
			}
		}
	}

	private int findMax(int r, int c, String search)
	{
		if(r<0 || r>=grid.length || c<0 || c>=grid[r].length || visited[r][c] || !grid[r][c].equals(search)){
			return 0;
		}
		visited[r][c] = true;
		return 1 + findMax(r+1, c, search) + findMax(r-1, c, search) + findMax(r, c+1, search) + findMax(r, c-1, search);
	}

	public int findMax(String search)
	{
		int max = 0;
		for(int r=0; r<grid.length; r++){
			for(int c=0; c<grid[r].length; c++){
				if(grid[r][c].equals(search) && !visited[r][c]){
					visited[r][c] = true;
					int count = 1 + findMax(r+1, c, search) + findMax(r-1, c, search) + findMax(r, c+1, search) + findMax(r, c-1, search);
					if(count > max){
						max = count;
					}
				}
			}
		}
		return max;
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
