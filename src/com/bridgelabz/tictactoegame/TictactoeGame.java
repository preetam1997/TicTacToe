package com.bridgelabz.tictactoegame;

import java.util.Scanner;

public class TictactoeGame {
	static Scanner userInputFromConsole = new Scanner(System.in);
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
		String userInput = userInputFromConsole.nextLine();
		char UserInput = userInput.toUpperCase().charAt(0);
		return UserInput;
	}

	/* UC3 */
	public static void displayBoard(char[] board) {
		System.out.println(board[1] + "|" + board[2] + "|" + board[3]);
		System.out.println(board[4] + "|" + board[5] + "|" + board[6]);
		System.out.println(board[7] + "|" + board[8] + "|" + board[9]);
	}

	/* UC4 & UC5 */
	public static void enterUserInputAtDesiredLocation(char UserInput, char[] board) {
		System.out.println("Enter Desired Location Between 1-9");
		boolean temp = true;
		while (temp) {
			String userDesiredLocation = userInputFromConsole.nextLine();
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
	public static void tossFunction(char[] board) {
		double tossResult = Math.floor(Math.random() * 10) % 2;
		if (tossResult == HEAD) {
			System.out.println("Player Starts First");
		} else if (tossResult == TAIL) {
			System.out.println("Computer Starts First");
		}
	}

	/* UC7 */
	public static void winningConditions(char[] board) {
		if (board[1] == 'X' && board[2] == 'X' && board[3] == 'X' || board[1] == 'X' && board[5] == 'X' && board[9] == 'X' || board[1] == 'X' && board[4] == 'X' && board[7] == 'X'
			|| board[2] == 'X' && board[5] == 'X' && board[8] == 'X'|| board[3] == 'X' && board[6] == 'X' && board[9] == 'X' || board[4] == 'X' && board[5] == 'X' && board[6] == 'X' 
			||  board[7] == 'X' && board[8] == 'X' && board[9] == 'X') {

		}

			}

	public static void main(String[] args) {
		System.out.println("Welcome To TicTAcToe Game ");
		char[] board = createBoard();
		char userLetter = chooseSymbol();
		char computerLetter = (userLetter == 'X') ? 'O' : 'X';
		displayBoard(board);
		enterUserInputAtDesiredLocation(userLetter, board);
		displayBoard(board);
		enterUserInputAtDesiredLocation(userLetter, board);
		displayBoard(board);
	}
}
