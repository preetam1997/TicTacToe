package com.bridgelabz.tictactoegame;

import java.util.Scanner;

public class TictactoeGame {
	static Scanner myObj = new Scanner(System.in);
	public static final int HEAD = 0;
	public static final int TAIL = 1;

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

	/* UC4 & UC5*/
	public static void enterUserInputAtDesiredLocation(char UserInput, char[] board) {
		System.out.println("Enter Desired Location Between 1-9");

		boolean temp = true;
		while (temp) {

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
	/* UC6 */
	public static void tossFunction() {
		double tossResult = Math.floor(Math.random()*10)%2;
		if(tossResult==HEAD) {
			System.out.println("Player Starts First");
		}
		else if(tossResult==TAIL) {
			System.out.println("Computer Starts First");
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
