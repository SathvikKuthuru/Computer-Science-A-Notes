import java.util.Scanner;

public class connectFour {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] board = new char[8][8];

		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				board[row][col] = ' ';
			}
		}

		// 0 - Playing, 1 - X wins, 2 - O wins, 3 - Tied Game
		int turn = 1, winner = 0;
		while (winner == 0) {
			printBoard(board);
			if (turn % 2 == 0)
				System.out.println("X you're up");
			else
				System.out.println("It is O's turn!");
			System.out.println("Where do you want to go");
			/*
			 * int x = scan.nextInt()-1; int y = 7; while(board[y][x] != ' '){
			 * y--; } //place the piece if(turn % 2 == 0) board[y][x] = 'X';
			 * else board[y][x] = 'O';
			 */
			while (!placePiece(board, scan.nextInt(), turn)) {
				System.out.println("Sorry that column is full! Pick a different one");
			}
			winner = checkWinner(board);
			if (turn == 1)
				turn = 2;
			else
				turn = 1;
			/*
			 * if (turn == 9 && winner == 0) { winner = 3; }
			 */
		}
		printBoard(board);

		
		if (winner == 1)
			System.out.println("X is the Champ");
		else if (winner == 2)
			System.out.println("O blew you out of the water!");
		else
			System.out.println("Dencker just wins because he wrote me.");
	}

	public static boolean placePiece(char[][] b, int x, int a) {
		int y = 7;
		while (b[y][x - 1] != ' ') {
			y--;
			if (y == -1)
				break;
			// System.out.println(y);
		}
		if (y == -1)
			return false;
		else if (a == 1)
			b[y][x - 1] = 'O';
		else
			b[y][x - 1] = 'X';
		return true;
	}

	public static int checkWinner(char[][] b) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 4; j++) {
				if (b[i][j] == 'X' && b[i][j+1] == 'X' && b[i][j+2] == 'X' && b[i][j+3] == 'X')
					return 1;
				if (b[i][j] == 'O' && b[i][j+1] == 'O' && b[i][j+2] == 'O' && b[i][j+3] == 'O')
					return 2;
			}
		}
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 4; j++) {
				if (b[j][i] == 'X' && b[j+1][i] == 'X' && b[j+2][i] == 'X' && b[j+3][i] == 'X')
					return 1;
				if (b[j][i] == 'O' && b[j+1][i] == 'O' && b[j+2][i] == 'O' && b[j+3][i] == 'O')
					return 2;
			}
		}
		return 0;
	}

	public static void printBoard(char[][] b) {
		for (int row = 0; row < b.length; row++) {
			System.out.println("-----------------");
			for (int col = 0; col < b[0].length; col++) {
				System.out.print("|" + b[row][col]);
			}
			System.out.println("|");
		}
		System.out.println("-----------------");
	}
}
