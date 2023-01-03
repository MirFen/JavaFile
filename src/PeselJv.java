package src;

public class PeselJv {

  public static void validate11(String pesel) {
    // String pesel = "84010347872";
    boolean validPesel;

    if (validPesel = isPaselValid(pesel)) {
      System.out.println("Pesel " + pesel + " jest poprawny");
      gender(pesel);
    } else {
      System.out.println("Pesel " + pesel + " jest niepoprawny");
    }
  }

  private static void gender(String pesel) {
    int mul;
    // Walidator płci
    mul = read(pesel.charAt(9));
    int reszta = mul % 2;
    // boolean validGender = reszta != 0  ;

    if (reszta != 0) {
      System.out.println("Płeć: " + "Kobieta");
    } else {
      System.out.println("Płeć: " + "Mężczyzna");
    }
  }

  private static boolean isPaselLenghtValid(String pesel) {
    return pesel != null && pesel.length() == 11;
  }

  private static boolean isNumber(String pesel) {
    for (int i = 0; i < pesel.length(); i++) {
      char c = pesel.charAt(i);
      //    ! not 1=0 a 0=1 not true = false  not false = true
      if (!Character.isDigit(c)) {
        return false;
      }
    }
    return true;
  }

  private static boolean isPaselValid(String pesel) {
    return isPaselLenghtValid(pesel) && isNumber(pesel) && ctrlValid(pesel);
  }

  private static boolean ctrlValid(String pesel) {
    int sum = 0;

    int[] weights = { 1, 3, 7, 9, 1, 3, 7, 9, 1, 3 };

    for (int i = 0; i < 10; i++) {
      sum += placeSearch(pesel.charAt(i), weights[i]);
    }
    String sumAsString = String.valueOf(sum);
    String last = sumAsString.substring(sumAsString.length() - 1);
    int lastAsNumber = Integer.parseInt(last);
    int mul = read(pesel.charAt(10));
    boolean validPesel =
      (lastAsNumber == 0 && mul == 0) ||
      (lastAsNumber > 0 && 10 - lastAsNumber == mul);
    return validPesel;
  }

  private static int placeSearch(char c, int weight) {
    String charString = String.valueOf(c);
    int digit = Integer.parseInt(charString);
    int multiply = digit * weight;
    return multiply;
  }

  private static int read(char c) {
    String charString = String.valueOf(c);
    int digit = Integer.parseInt(charString);
    return digit;
  }
}
