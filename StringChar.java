public class StringChar {
    public static void main(String[] args) {
        String name = "mirek";
        System.out.println(name);
        char first = name.charAt(0);
String firstString = String.valueOf(first);
String firstLetterUpperCase = firstString.toUpperCase();
        System.out.println(firstLetterUpperCase + name.substring(1) );
    }
}
