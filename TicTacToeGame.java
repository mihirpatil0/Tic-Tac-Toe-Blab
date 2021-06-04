package tictactoe;

public class TicTacToeGame 
{	
	static char[][] tttBoard = new char[3][3];
	
	/**
	 * {@summary}
	 * Created matrix board.
	 * 0th index is ignored.
	 * assigning empty space to remaining blocks.
	 */
	public static void createBoard()
	{
		for(int i=0; i<tttBoard.length; i++)
		{
			for (int j=1; j<tttBoard.length; j++)
			{	
				tttBoard[i][j] = ' '; 
			}
		}
	}
	
	public static void main(String[] args) 
	{	
		//calling the createBoard method
		createBoard();
	}
}

