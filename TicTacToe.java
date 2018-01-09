
public class TicTacToe {
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    char[][] board = new char[3][3];
    
    for (int row = 0; row < 3; row++){
       for(int col = 0; col < 3; col++){
         board[row][col] = '@';
       }
    }
    
    // 0 - Playing, 1 - X wins, 2 - O wins, 3 - Tied Game
    int turn = 0, winner = 0;
    while (winner == 0){
      displayBoard(board);
      if (turn % 2 == 0) System.out.println("X you're up");
      else System.out.println("It is Y's turn!");
      System.out.println("Where do you want to go");
      int x = scan.nextInt()-1;
      int y = scan.nextInt()-1;
      
      //place the piece
      if(turn % 2 == 0) board[y][x] == 'X';
      else board[y][x] == 'O';
      winner = checkWinner(board);
      turn++;
      if (turn == 9; && winner == 0) {
        winner = 3;
      }
    }
  }
  
  public static int checkWinner(char[][] board) {
    return 0;
  }
  
  public static void displayBoard(char[][] b) {
    for (int row = 0; row < b.length; row++) {
      for (int col = 0; col < b[0].length; col++) {
        System.out.print(b[row][col]);  
      }
      System.out.println();
    }
  }
}
