public class TablicaWymiarowa {

  public static void main(String[] args) {
    int[][] multiplicationTable = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] multiplicationTable2 = new int[][] {
      { 1, 2, 3 },
      { 4, 5, 6 },
      { 7, 8, 9 },
    };
    int[][] multiplicationTable3 = new int[3][50];

    int[][] multiplicationTable4 = new int[3][];
    // Różne wielkości tablic
    multiplicationTable4[0] = new int[10];
    multiplicationTable4[1] = new int[5];
    multiplicationTable4[2] = new int[12];
    // multiplicationTable4[3] = new int [8];

    multiplicationTable4[0][9] = 50;
    // multiplicationTable4[1][9] = 50;

    String[][] arrau2D = {
      { "00", "01", "02" },
      { "10", "11", "12" },
      { "20", "21", "22" },
    };
    System.out.println("Element na poz. 01: " + arrau2D[0][1]);
    System.out.println("Element na poz. 10: " + arrau2D[1][0]);
    // można dodawać i dodawać
    int[][][] multiplicationTable5 = new int[3][50][5];

    int[][][] multiplicationTable6 = new int[3][][];
  }
}
