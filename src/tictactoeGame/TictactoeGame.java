package tictactoeGame;

import java.util.Scanner;

public class TictactoeGame {
	private static char[] board = new char[10];

	/* UC1 */
	public static char[] createBoard() {

		for (int position = 0; position < board.length; position++) {
			board[position] = ' ';
		}
		return board;
	}

	/* UC2 */
	public static char chooseSymbol() {
		System.out.println("Enter X or O");
		Scanner myObj = new Scanner(System.in);
		String userInput = myObj.nextLine();
		char UserInput = userInput.toUpperCase().charAt(0);
		myObj.close();
		return UserInput;
	}
	/*UC3*/
	public static void displayBoard() {
		for (int position = 0; position < board.length; position++) {
			System.out.println(board[position]);
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome To TicTAcToe Game ");
		char[] board = createBoard();
		char userLetter = chooseSymbol();
		char computerLetter = (userLetter == 'X') ? '0' : 'X';

	}
}
