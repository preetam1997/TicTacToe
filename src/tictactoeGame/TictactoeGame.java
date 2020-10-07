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

	/* UC3 */
	public static void displayBoard() {
		System.out.println(board[1] + "|" + board[2] + "|" + board[3]);
		System.out.println(board[4] + "|" + board[5] + "|" + board[6]);
		System.out.println(board[7] + "|" + board[8] + "|" + board[9]);
	}

	public static void main(String[] args) {
		System.out.println("Welcome To TicTAcToe Game ");
		char[] board = createBoard();
		char userLetter = chooseSymbol();
		char computerLetter = (userLetter == 'X') ? '0' : 'X';
		displayBoard();
	}
}
