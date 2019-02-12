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
      for (int i = 1; c + i < board[0].length; i++){
        board[r][c + i] = board[r][c+i] + 1;
        if (r + i < board[0].length){
          board[r + i][c + i] = board[r + i][c + i] + 1;
        }
        if (r - i >= 0){
          board[r - i][c + i] = board[r - i][c + i] + 1;
        }
    }
    return true;
    }
    return false;
  }
  public boolean removeQueen(int r, int c){
    if (board[r][c] == -1){
      board[r][c] = 0;
      for (int i = 1; c + i < board[0].length; i++){
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
  public boolean solve(){
    if (board[0][0]!= 0){
      throw new IllegalStateException();
    }
    clear();
    return solveP(0);
  }
  public boolean solveh(int r, int c, int recursion, int t){
    if (recursion == t){
      return true;
    }
    for(int i = 0; i < board[0].length; i++){
      if (addQueen(r, i)){
        if(solveh(r + i, i, recursion + 1, t)){
          return true;
        }
        else{
          removeQueen(r, i);
        }
      }
    }
    return false;
  }
  public boolean solveP(int count){
    if (count >= board.length){
      return true;
    }
    else{
      for(int i = 0; i < board.length; i++){
        if (addQueen(i, count)){
          if (solveP(count + i)){
            return true;
          }
          removeQueen(i, count);
        }
      }
      return false;
    }
  }
  private void clear(){
    for (int i = 0; i < board.length; i++){
      for (int b = 0; b < board[0].length; b++){
        board[i][b] = 0;
      }
    }
}
  public int countH(int count){
    if (count >= board.length){
      return 1;
    }
    int returnValue = 0;
    for( int i = 0; i < board.length; i++){
      if (addQueen(i,count)){
        returnValue += countH(count + i);
        removeQueen(i, count);
      }
    }
    return returnValue;
  }
  public int countSolutions(){
    if (board[0][0]!= 0){
      throw new IllegalStateException();
    }
    clear();
    return countH(0);
  }
}
