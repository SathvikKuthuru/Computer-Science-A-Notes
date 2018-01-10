import java.util.Scanner;

public class connectFour {
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    char[][] board = new char[8][8];
    
    for (int row = 0; row < 8; row++){
       for(int col = 0; col < 8; col++){
         board[row][col] = ' ';
       }
    }
    
    // 0 - Playing, 1 - X wins, 2 - O wins, 3 - Tied Game
    int turn = 0, winner = 0;
    while (winner == 0){
      printBoard(board);
      if (turn % 2 == 0) System.out.println("X you're up");
      else System.out.println("It is O's turn!");
      System.out.println("Where do you want to go");
      int x = scan.nextInt()-1;
      int y = 7;
      while(board[y][x] != ' '){
    	  y--;
      }
      //place the piece
      if(turn % 2 == 0) board[y][x] = 'X';
      else board[y][x] = 'O';
      winner = checkWinner(board);
      turn++;
      if (turn == 9 && winner == 0) {
        winner = 3;
      }
    }
    
    if(winner == 1) System.out.println("X is the Champ");
    else if (winner == 2) System.out.println("O blew you out of the water!");
    else System.out.println("Dencker just wins because he wrote me.");
  }
  
  public static int checkWinner(char[][] b) {
    for(int i = 0; i < 3; i++) {
      if(b[i][0] == 'X' && b[i][1] == 'X' && b[i][2] == 'X') return 1;
      if(b[0][i] == 'X' && b[1][i] == 'X' && b[2][i] == 'X') return 1;
      if(b[i][0] == 'O' && b[i][1] == 'O' && b[i][2] == 'O') return 2;
      if(b[0][i] == 'O' && b[1][i] == 'O' && b[2][i] == 'O') return 2;
    }
    return 0;
  }
  
  public static void printBoard(char[][] b) {
    for (int row = 0; row < b.length; row++) {
    	System.out.println("-----------------");
      for (int col = 0; col < b[0].length; col++) {
        System.out.print("|" +b[row][col]);  
      }
      System.out.println("|");
    }
    System.out.println("-----------------");
  }
}
