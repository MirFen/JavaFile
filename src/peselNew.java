package src;

public class peselNew {
    public static void main(String[] args) {
        String pesel = "84010347872";
        int sum = 0;
        // int mul = 0;
       
//       sum += placeSearch(pesel.charAt(0), 1);
//        sum += placeSearch(pesel.charAt(1), 3);
//        sum += placeSearch(pesel.charAt(2), 7);
//        sum += placeSearch(pesel.charAt(3), 9);
//        sum += placeSearch(pesel.charAt(4), 1);
//        sum += placeSearch(pesel.charAt(5), 3);
//        sum += placeSearch(pesel.charAt(6), 7);
//        sum += placeSearch(pesel.charAt(7), 9);
//        sum += placeSearch(pesel.charAt(8), 1);
//        sum += placeSearch(pesel.charAt(9), 3);


        int[] weights = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};

        for (int i = 0; i < weights.length; i++) {
            sum += placeSearch(pesel.charAt(i), weights[i]);
        }
        
        System.out.println(sum);
        String sumAsString = String.valueOf(sum);
        String last = sumAsString.substring(sumAsString.length()-1);
        int lastAsNumber = Integer.parseInt(last);
        System.out.println(lastAsNumber);
        int mul = read(pesel.charAt(10));
boolean validPesel = (lastAsNumber == 0 && mul == 0) || (lastAsNumber > 0 && 10 - lastAsNumber == mul);

if (validPesel = (lastAsNumber == 0 && mul == 0) || (lastAsNumber > 0 && 10 - lastAsNumber == mul)) {
    System.out.println("Pesel "+ pesel + " jest poprawny");
}else {
    System.out.println("Pesel "+ pesel + " jest niepoprawny");
}


// Walidator płci
 mul = read(pesel.charAt(9));
int reszta = mul % 2 ;
// boolean validGender = reszta != 0  ;

if ( reszta != 0 ) {
    System.out.println("Płeć: " + "Kobieta");
}else  {
    System.out.println("Płeć: " + "Mężczyzna");
}  
    }


    private static int placeSearch(char c , int weight) {
       
        String charString = String.valueOf(c);
int digit = Integer.parseInt(charString);
int multiply = digit * weight;
System.out.println(multiply);
return multiply;
    }
    

    private static int read(char c ) {
        String charString = String.valueOf(c);
        int digit = Integer.parseInt(charString);
        return digit;
    }
}
