package zad;


import java.util.Arrays;
import java.util.random.RandomGenerator;

public class Main {

  private static final int n = 15;
  private static final int Max = 100;

  public static void main(String[] args) {
    int[] ages = new int[n + 1];

    count(ages);
    for (int i = 0; i <= n; i++) {
         int valid = ages[i];


    System.out.println(valid +":"+ indexAge(valid));



boolean x;

        if (indexAge(valid) == Age.ADULT) {
            x = false;
            System.out.println(indexAge(valid) +" : "+ x);
        } else if (indexAge(valid) == Age.TEENAGER) {
            x = false;
            System.out.println(indexAge(valid) +" : "+ x);
        } else if (indexAge(valid) == Age.CHILD) {
            x = true;
            System.out.println(indexAge(valid) +" : " + x);
        }

//        for (Age age : Age.values()) {
//            if (indexAge(valid) == Age.ADULT) {
//                System.out.println(indexAge(valid) +" : "+ indexAgeValid( age));
//            } else if (indexAge(valid) == Age.TEENAGER) {
//                System.out.println(indexAge(valid) +" : "+  indexAgeValid( age));
//            } else if (indexAge(valid) == Age.CHILD) {
//                System.out.println(indexAge(valid) +" : "+  indexAgeValid( age));
//            }
//        }


    }
  }



//private static boolean indexAgeValid(Age age){
//
//    if (age == Age.TEENAGER || age == Age.ADULT) {
//       return false;
//
//    } else if (age == Age.CHILD) {
//       return true;
//    } else {
//        throw new IllegalArgumentException();
//    }
//return switch (age){
//    case CHILD -> true;
//    case TEENAGER,ADULT -> false;
//};

//}
private static Age indexAge(int valid){
    if (valid <= 10) {
        return Age.CHILD;
    } else if (valid <= 18 && valid >11) {
        return Age.TEENAGER;
    }
    return Age.ADULT;
}




  private static void count(int[] ages) {
    RandomGenerator randomGenerator = RandomGenerator.getDefault();

    for (int i = 0; i <= n; i++) {
      int randomNumber = randomGenerator.nextInt(0, Max);

      int valid = randomNumber;
      ages[i] = valid;
    }

    System.out.println(Arrays.toString(ages));
    System.out.println();
  }
}
