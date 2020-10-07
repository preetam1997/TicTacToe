package com.bridgelabz.tictactoegame;

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
	public static char chooseSymbol() {
		System.out.println("Enter X or O");
		Scanner myObj = new Scanner(System.in);
		String userInput = myObj.nextLine();
		char UserInput = userInput.toUpperCase().charAt(0);

		return UserInput;
	}

	/* UC3 */
	public static void displayBoard(char[] board) {
		System.out.println(
				Character.toString(board[1]) + "|" + Character.toString(board[2]) + "|" + Character.toString(board[3]));
		System.out.println(
				Character.toString(board[4]) + "|" + Character.toString(board[5]) + "|" + Character.toString(board[6]));
		System.out.println(
				Character.toString(board[7]) + "|" + Character.toString(board[8]) + "|" + Character.toString(board[9]));
	}

	/* UC4 */
	public static void enterUserInputAtDesiredLocation(char UserInput, char[] board) {
		System.out.println("Enter Desired Location Between 1-9");

		boolean temp = true;
		while (temp) {
			Scanner myObj = new Scanner(System.in);
			String userDesiredLocation = myObj.nextLine();
			if (Integer.parseInt(userDesiredLocation) < 1 || Integer.parseInt(userDesiredLocation) > 9) {
				System.out.println("Enter Valid Location");
			} else if (board[Integer.parseInt(userDesiredLocation)] == 'X'
					|| board[Integer.parseInt(userDesiredLocation)] == 'Y') {
				System.out.println("Position Already Occupied, Enter Another Location");
			} else {
				board[Integer.parseInt(userDesiredLocation)] = UserInput;
				temp = false;
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome To TicTAcToe Game ");
		char[] board = createBoard();
		char userLetter = chooseSymbol();
		char computerLetter = (userLetter == 'X') ? '0' : 'X';
		displayBoard(board);
		enterUserInputAtDesiredLocation(userLetter, board);
		displayBoard(board);
		enterUserInputAtDesiredLocation(userLetter, board);
		displayBoard(board);
	}
}
