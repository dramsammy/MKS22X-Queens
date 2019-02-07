public class QueenBoard{
  private int[][] board;
  public QueenBoard(int size){
    board = new int[size][size];
    for (int i = 0; i < board[0].length; i++){
      for (int a = 0; a < board.length; a++){
        board[i][a] = 0;
      }
    }
    
  }
}
