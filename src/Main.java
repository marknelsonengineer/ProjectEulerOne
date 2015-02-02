public class Main {

  public static boolean isProduct( int i ) {
    if( i%3 == 0 || i%5 == 0) {
      return true;
    }
    else {
      return false;
    }
  }

  public static void main(String[] args) {
    System.out.println("Start EulerOne");

    int iRunningTally = 0;

    for(int i = 3 ; i < 1000 ; i++ ) {

      if( isProduct( i )) {
        System.out.println( i );
        iRunningTally += i;
      }

    }

    System.out.println( "The answer is " + iRunningTally );
    System.out.println("End EulerOne");
  }
}
