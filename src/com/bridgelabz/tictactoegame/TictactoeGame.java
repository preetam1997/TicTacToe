package com.bridgelabz.tictactoegame;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class TicTacToeGame {
	static Scanner userInputFromConsole = new Scanner(System.in);
	public static final int HEAD = 0;
	public static final int TAIL = 1;

	/* UC1 */
	public static char[] createBoard() {
		char[] board = new char[10];
		LinkedList<Integer> emptyPosition = new LinkedList<>();
		for (int position = 1; position < board.length; position++) {
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
	@SuppressWarnings("deprecation")
	public static void enterUserInputAtDesiredLocation(char UserInput, char[] board) {
		System.out.println("Enter Desired Location Between 1-9");
		boolean temp = true;
		while (temp) {
			String userDesiredLocation = userInputFromConsole.nextLine();
			if (Integer.parseInt(userDesiredLocation) < 1 || Integer.parseInt(userDesiredLocation) > 9) {
				System.out.println("Enter Valid Location");
			} else if (board[Integer.parseInt(userDesiredLocation)] == 'X'
					|| board[Integer.parseInt(userDesiredLocation)] == 'O') {
				System.out.println("Position Already Occupied, Enter Another Location");
			} else {
				board[Integer.parseInt(userDesiredLocation)] = UserInput;
				temp = false;

			}
		}

	}

	public static boolean winningConditions(char[] board, char symbol) {
		if (board[1] == symbol && board[2] == symbol && board[3] == symbol
				|| board[1] == symbol && board[5] == symbol && board[9] == symbol
				|| board[1] == symbol && board[4] == symbol && board[7] == symbol
				|| board[2] == symbol && board[5] == symbol && board[8] == symbol
				|| board[3] == symbol && board[6] == symbol && board[9] == symbol
				|| board[4] == symbol && board[5] == symbol && board[6] == symbol
				|| board[7] == symbol && board[8] == symbol && board[9] == symbol
				|| board[3] == symbol && board[5] == symbol && board[7] == symbol) {
			return true;
		} else {
			return false;
		}

	}

	/* UC6 */
	public static String tossFunction() {
		double tossResult = Math.floor(Math.random() * 10) % 2;
		if (tossResult == HEAD) {
			return "Player";
		} else if (tossResult == TAIL) {
			return "Computer";
		}
		return null;
	}

	/* UC7 */

	public static void main(String[] args) {
		System.out.println("Welcome To TicTAcToe Game ");
		boolean playAgain = true;
		while (playAgain) {
			char[] board = createBoard();
			char userLetter = chooseSymbol();
			char computerLetter = (userLetter == 'X') ? 'O' : 'X';
			displayBoard(board);
			System.out.println("----------------");
			String turn = tossFunction();
			boolean won = false;
			int turns = 0;

			if (turn.matches("player")) {
				System.out.println("You are going first!");
				System.out.println();
				while (!won) {
					enterUserInputAtDesiredLocation(userLetter, board);
					turns++;
					displayBoard(board);
					if (winningConditions(board, userLetter)) {
						won = true;
						System.out.println("Congrats you won!");
					}
					if (turns == 9) {
						won = true;
						System.out.println("Its a bore draw!");
						break;
					}
					if (!won) {
						Computer.takeTurn(board, userLetter, computerLetter);
						turns++;
						System.out.println();
						displayBoard(board);
						System.out.println();
						if (winningConditions(board, computerLetter)) {
							won = true;
							System.out.println("Computer wins !!!");
						}
						if (turns == 9) {
							won = true;
							System.out.println("Its a bore draw!");
							break;
						}
					}

				} // close while 1
			} else {

				System.out.println("Computer goes first!");
				System.out.println();
				while (!won) {
					Computer.takeTurn(board, userLetter, computerLetter);
					turns++;
					displayBoard(board);
					if (winningConditions(board, computerLetter)) {
						won = true;
						System.out.println("Computer wins !!!");
					}
					if (turns == 9) {
						won = true;
						System.out.println("Its a draw!");
						break;
					}
					if (!won) {
						enterUserInputAtDesiredLocation(userLetter, board);
						turns++;
						System.out.println();
						displayBoard(board);
						System.out.println();
						if (winningConditions(board, userLetter)) {
							won = true;
							System.out.println("You gots the winz!");
						}
						if (turns == 9) {
							won = true;
							System.out.println("Its a draw!");
							break;
						}
					}

				}

			}
			System.out.println("Would you like to play again? Type 1 for yes or 2 to quit");
	           System.out.println();
	           if(userInputFromConsole.nextLine().matches("2") ){
	               playAgain = false;
	           }
		}

	}
}