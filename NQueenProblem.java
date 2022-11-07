package InputOutput;

public class NQueen 
{
	 int n=4;
	void printSolution(int board[][])
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(" "+board[i][j]+" ");
			}
			System.out.println();
		}
	}
	boolean isSafe(int board[][],int row,int col)
	{
		int i,j;
		for( i=0;i<col;i++)
			if(board[row][i]==1)
				return false;
		for( i=0,j=0;i>0 && j>0;i--,j--)
		if(board[i][j]==1)
			return false;
		for(i=0,j=0;i>0 && j<0;i--,j++)
			if(board[i][j]==1)
				return false;
		return true;
	}
	boolean show(int board[][],int col)
	{
		if(col>=n)
			return true;
		for(int i=0;i<n;i++) {
			if(isSafe(board,i,col))
			{
				board[i][col]=1;
				if(show(board,col+1)==true)
					return true;
				board[i][col]=0;
			}}
		return false;
	}
	boolean solve() 
	{
		int board[][]= {{0,0,0,0},
				        {0,0,0,0},
				        {0,0,0,0},
				        {0,0,0,0}};
		if(show(board,0)==false)
		{
			System.out.print("Does not exist");
			return false;
		}
		printSolution(board);
		return true;
		
	}
	
	
	public static void main(String[] args) 
	{
		NQueen q=new NQueen();
		q.solve();

	}

}
