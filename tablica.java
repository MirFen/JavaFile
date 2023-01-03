import java.util.random.RandomGenerator;

public class tablica {
    public static void main(String[] args) {
        String[] strings = {"Mirek","Ola","Irek","zygmunt","Piotr","Zofia","Małgosia","Wojciech","Kamil","Przemysław"};
        int number = strings.length ;
        
        System.out.println(number);

RandomGenerator randomGenerator =  RandomGenerator.getDefault();
int randomNumber = randomGenerator.nextInt(0,number);
System.out.println(randomNumber);

      
        System.out.println(strings[randomNumber]);
    }
}
