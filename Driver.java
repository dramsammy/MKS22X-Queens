public class Driver{
  public static void runTest(int i){
  QueenBoard b;
  int[]tests =   {1,2,3,4,5,8};
  int[]answers = {1,0,0,2,10,92};
  if(i >= 0 && i < tests.length ){
    int size = tests[i];
    int correct = answers[i];
    b = new QueenBoard(size);
    int ans  = b.countSolutions();

    if(correct==ans){
      System.out.println("PASS board size: "+tests[i]+" "+ans);
    }else{
      System.out.println("FAIL board size: "+tests[i]+" "+ans+" vs "+correct);
    }
  }
}
  public static void main(String[] args) {
    // QueenBoard test = new QueenBoard(4);
    // System.out.println(test);
    // System.out.println(test.toStringDebug());
    // test.addQueen(1,1);
    // System.out.println(test);
    // System.out.println(test.toStringDebug());
    // test.addQueen(1,1);
    // System.out.println(test);
    // System.out.println(test.toStringDebug());
    // test.addQueen(3,2);
    // System.out.println(test);
    // System.out.println(test.toStringDebug());
    // test.removeQueen(3,2);
    // System.out.println(test);
    // System.out.println(test.toStringDebug());
    // QueenBoard test1 = new QueenBoard(4);
    // System.out.println(test1.solve());
    // QueenBoard test2 = new QueenBoard(3);
    // System.out.println(test2.solve());
    // System.out.println(test1.countSolutions());
    // QueenBoard test3 = new QueenBoard(2);
    // System.out.println(test3.solve());
    for (int i = 0; i < 5; i++){
      runTest(i);
    }
}
}
