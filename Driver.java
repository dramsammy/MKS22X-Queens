public class Driver{
  public static void main(String[] args) {
    QueenBoard test = new QueenBoard(4);
    System.out.println(test);
    System.out.println(test.toStringDebug());
    test.addQueen(1,1);
    System.out.println(test);
    System.out.println(test.toStringDebug());
    test.addQueen(1,1);
    System.out.println(test);
    System.out.println(test.toStringDebug());
    test.addQueen(3,2);
    System.out.println(test);
    System.out.println(test.toStringDebug());
    test.removeQueen(3,2);
    System.out.println(test);
    System.out.println(test.toStringDebug());
    QueenBoard test1 = new QueenBoard(4);
    System.out.println(test1.solve());
    QueenBoard test2 = new QueenBoard(3);
    System.out.println(test2.solve());
    System.out.println(test1.countSolutions());
    QueenBoard test3 = new QueenBoard(2);
    System.out.println(test3.solve());
    QueenBoard test4 = new QueenBoard(10);
    System.out.println(test4.countSolutions());
}
}
