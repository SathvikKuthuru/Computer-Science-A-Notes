
public class TicTacToe {
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    char[][] board = new char[3][3];
    
    for (int row = 0; row < 3; row++){
       for(int col = 0; col < 3; col++){
         board[row][col] = '@';
       }
    }
    
    //Skip around 25 lines
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
