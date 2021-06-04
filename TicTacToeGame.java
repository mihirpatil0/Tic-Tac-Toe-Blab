package tictactoe;

public class TicTacToeGame 
{	
	public char[][] tttBoard = new char[3][3];
	
	void createBoard()
	{
		for(int i=0; i<tttBoard.length; i++)
		{
			for (int j=0; j<tttBoard.length; j++)
			{	
				tttBoard[i][j] = '-';
			}
		}
	}
	
	public static void main(String[] args) 
	{
		TicTacToeGame tttGame = new TicTacToeGame();
		tttGame.createBoard();
	}
}

