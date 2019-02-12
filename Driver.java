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
  }
}
