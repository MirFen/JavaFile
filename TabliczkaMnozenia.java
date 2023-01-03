import java.util.Arrays;

public class TabliczkaMnozenia {

  /**
   *
   */
  private static final int Max = 10 ;

  public static void main(String[] args) {
    int[][] multiplicationTable = new int[Max][Max];

    metod1(multiplicationTable);
  }

  private static void metod1(int[][] multiplicationTable) {
    for (int i = 1; i <= Max; i++) {
      for (int j = 1; j <= Max; j++) {
        int valid = i * j;
        multiplicationTable[i-1][j-1] = valid;
      }
    }
    for (int i = 0; i <= multiplicationTable.length - 1 ; i++) {
      System.out.print(Arrays.toString(multiplicationTable[i]));
      System.out.println();
    }
  }
}
