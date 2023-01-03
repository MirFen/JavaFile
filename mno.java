package src;

public class mno {

  /**
   *
   */
  private static final int Max = 10;

  public static void main(String[] args) {

    
    for (int i = 1; i <= Max; i++) {
      for (int j = 1; j <= Max; j++) {
        System.out.print(i * j + " ");

      }
      System.out.println();
    }
  }
}
