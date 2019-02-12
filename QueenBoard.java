public class QueenBoard{
  private int[][] board;
  public QueenBoard(int size){
    board = new int[size][size];
    for (int i = 0; i < board[0].length; i++){
      for (int a = 0; a < board.length; a++){
        board[i][a] = 0;
      }
    }
  //countSolutions();
  }
  public String toString(){
    String returnValue = "";
    for(int i = 0; i < board.length; i++){
      for(int a = 0; a < board[0].length; a++){
        if (board[i][a] >= 0){
          returnValue += "_";
        }
        else{
          returnValue += "Q";
        }
      }
      returnValue+= "\n";
    }
    return returnValue;
  }
  public boolean addQueen(int r, int c){
    if (board[r][c] == 0){
      board[r][c] = -1;
      for (int i = 1; i < board[0].length; i++){
        board[r][c + i] = board[r][c+i] + 1;
        if (r + i < board[0].length){
          board[r + i][c + i] = board[r + i][c + i] + 1;
        }
        if (r - i < board[0].length){
          board[r - i][c + i] = board[r - i][c + i] + 1;
        }
    }
    return true;
    }
    return false;
  }
  private boolean removeQueen(int r, int c){
    if (board[r][c] == -1){
      board[r][c] = 0;
      for (int i = 1; i < board[0].length; i++){
        board[r][c + i] = board[r][c+i] - 1;
        if (r + i < board[0].length){
          board[r + i][c + i] = board[r + i][c + i] - 1;
        }
        if (r - i >= 0){
          board[r - i][c + i] = board[r - i][c + i] - 1;
        }
    }
  return true;
  }
  return false;
  }
  public String toStringDebug(){
    String returnValue = "";
    for (int i = 0; i < board.length; i++){
      for(int a = 0; a < board[0].length; a++){
        returnValue+= board[i][a] + "";
      }
      returnValue+= "\n";
    }
    return returnValue;
  }
}
