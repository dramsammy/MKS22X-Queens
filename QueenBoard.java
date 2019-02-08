public class QueenBoard{
  private int[][] board;
  public QueenBoard(int size){
    board = new int[size][size];
    for (int i = 0; i < board[0].length; i++){
      for (int a = 0; a < board.length; a++){
        board[i][a] = 0;
      }
    }
  countSolutions();
  }
  public String toString(){
    String returnValue = "";
    for(int i = 0; i < board.length; i++){
      for(int a = 0; a < board[0].length; a++){
        if (board[i][a] == 0){
          returnValue += "_";
        }
        else{
          returnValue += board[i][a] + "";
        }
      }
    }
  }
  private boolean addQueen(int r, int c){
    if (board[r][c] == 0){
      board[r][c] = -1;
    }
    for (int i = 0; i < board.length; i++){
      board[r][c] = board[r][c] + 1;
    }
    }
  }
}
