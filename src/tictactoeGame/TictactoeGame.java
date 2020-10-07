package tictactoeGame;

public class TictactoeGame {
	public static char[] createBoard() {
		char[] board = new char[10];
		for (int position = 0; position < board.length; position++) {
			board[position] = ' ';
		}
		return board;
	}

	public static void main(String[] args) {
		System.out.println("Welcome To TicTAcToe Problem ");
		char[] board = createBoard();
	}
}
