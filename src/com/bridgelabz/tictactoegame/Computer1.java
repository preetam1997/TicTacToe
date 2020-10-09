package com.bridgelabz.tictactoegame;

import java.util.Random;

public class Computer1 {
	public static int getRandom(int[] array) {
		int rand = new Random().nextInt(array.length);
		return array[rand];
	}

	public static void takeTurn(char[] board, char userInput, char computerInput) {
		boolean madeMove = false;
		for (int position = 1; position <= 3; position++) {
			if (board[position] == board[position + 3] && board[position] == computerInput) {
				if (board[position + 6] != userInput && board[position + 6] != computerInput) {
					board[position + 6] = computerInput;
					return;
				}
			}
		}

		for (int position = 1; position <= 3; position++) {
			if (board[position] == board[position + 6] && board[position] == computerInput) {
				if (board[position + 3] != userInput && board[position + 3] != computerInput) {
					board[position + 3] = computerInput;
					return;
				}
			}
		}

		for (int position = 7; position <= 9; position++) {
			if (board[position] == board[position - 3] && board[position] == computerInput) {
				if (board[position - 6] != userInput && board[position - 6] != computerInput) {
					board[position - 6] = computerInput;
					return;
				}
			}
		}

		// check if you can take a win horizontally
		for (int position = 1; position <= 7; position = position + 3) {
			if (board[position] == board[position + 1] && board[position] == computerInput) {
				if (board[position + 2] != userInput && board[position + 2] != computerInput) {
					board[position + 2] = computerInput;
					return;
				}
			}

		}

		for (int position = 1; position <= 7; position = position + 3) {
			if (board[position] == board[position + 2] && board[position] == computerInput) {
				if (board[position + 1] != userInput && board[position + 1] != computerInput) {
					board[position + 1] = computerInput;
					return;
				}
			}

		}

		for (int position = 3; position <= 9; position = position + 3) {
			if (board[position] == board[position - 1] && board[position] == computerInput) {
				if (board[position - 2] != userInput && board[position - 2] != computerInput) {
					board[position - 2] = computerInput;
					return;
				}
			}

		}

		// check if you can take a win diagonally
		if (board[1] == board[5] && board[1] == computerInput) {
			if (board[9] != userInput && board[9] != computerInput) {
				board[9] = computerInput;
				return;
			}
		}

		if (board[9] == board[5] && board[9] == computerInput) {
			if (board[1] != userInput && board[1] != computerInput) {
				board[1] = computerInput;
				return;
			}

		}
		if (board[3] == board[5] && board[3] == computerInput) {
			if (board[7] != userInput && board[7] != computerInput) {
				board[7] = computerInput;
				return;
			}
		}

		if (board[7] == board[5] && board[7] == computerInput) {
			if (board[3] != userInput && board[3] != computerInput) {
				board[3] = computerInput;
				return;
			}
		}

		if (board[9] == board[1] && board[9] == computerInput) {
			if (board[5] != userInput && board[5] != computerInput) {
				board[5] = computerInput;
				return;
			}
		}

		if (board[7] == board[3] && board[7] == computerInput) {
			if (board[5] != userInput && board[5] != computerInput) {
				board[5] = computerInput;
				return;
			}
		}

		// enter here
		// Blocks

		for (int position = 1; position <= 3; position++) {
			if (board[position] == board[position + 3] && board[position] == userInput) {
				if (board[position + 6] != userInput && board[position + 6] != computerInput) {
					board[position + 6] = computerInput;
					return;
				}
			}
		}

		for (int position = 1; position <= 3; position++) {
			if (board[position] == board[position + 6] && board[position] == userInput) {
				if (board[position + 3] != userInput && board[position + 3] != computerInput) {
					board[position + 3] = computerInput;
					return;
				}
			}
		}

		for (int position = 7; position <= 9; position++) {
			if (board[position] == board[position - 3] && board[position] == userInput) {
				if (board[position - 6] != userInput && board[position - 6] != computerInput) {
					board[position - 6] = computerInput;
					return;
				}
			}
		}

		// check if you can block horizontally
		for (int position = 1; position <= 7; position = position + 3) {
			if (board[position] == board[position + 1] && board[position] == userInput) {
				if (board[position + 2] != userInput && board[position + 2] != computerInput) {
					board[position + 2] = computerInput;
					return;
				}
			}

		}

		for (int position = 1; position <= 7; position = position + 3) {
			if (board[position] == board[position + 2] && board[position] == userInput) {
				if (board[position + 1] != userInput && board[position + 1] != computerInput) {
					board[position + 1] = computerInput;
					return;
				}
			}

		}

		for (int position = 3; position <= 9; position = position + 3) {
			if (board[position] == board[position - 1] && board[position] == userInput) {
				if (board[position - 2] != userInput && board[position - 2] != computerInput) {
					board[position - 2] = computerInput;
					return;
				}
			}

		}

		// block diagonally
		if (board[1] == board[5] && board[1] == userInput) {
			if (board[9] != userInput && board[9] != computerInput) {
				board[9] = computerInput;
				return;
			}
		}

		if (board[9] == board[5] && board[9] == userInput) {
			if (board[1] != userInput && board[1] != computerInput) {
				board[1] = computerInput;
				return;
			}

		}
		if (board[3] == board[5] && board[3] == userInput) {
			if (board[7] != userInput && board[7] != computerInput) {
				board[7] = computerInput;
				return;
			}
		}

		if (board[7] == board[5] && board[7] == userInput) {
			if (board[3] != userInput && board[3] != computerInput) {
				board[3] = computerInput;
				return;
			}
		}

		if (board[9] == board[1] && board[9] == userInput) {
			if (board[5] != userInput && board[5] != computerInput) {
				board[5] = computerInput;
				return;
			}
		}

		if (board[7] == board[3] && board[7] == userInput) {
			if (board[5] != userInput && board[5] != computerInput) {
				board[5] = computerInput;
				return;
			}
		}
		
		int[] corners = { 1, 3, 7, 9 };
		int centre = 5;
		int[] middle = { 2, 4, 6, 8 };
		// rule for taking available corner
		for (int position = 0; position < 4; position++) {
			if (board[corners[position]] != userInput && board[corners[position]] != computerInput) {
				board[corners[position]] = computerInput;
				return;
			}
		}

	}
}
