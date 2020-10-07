package tictactoeGame;

import java.util.Scanner;

public class TictactoeGame {
	/* UC1 */
	public static char[] createBoard() {
		char[] board = new char[10];
		for (int position = 0; position < board.length; position++) {
			board[position] = ' ';
		}
		return board;
	}

	/* UC2 */
	public static void chooseXorO() {
		System.out.println("Enter X or O");
		Scanner myObj = new Scanner(System.in);
		String userInput = myObj.nextLine();
		char c=userInput.charAt(0);
	}

	public static void main(String[] args) {
		System.out.println("Welcome To TicTAcToe Game ");
		char[] board = createBoard();
		chooseXorO();
	}
}
