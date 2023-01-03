package src;
public class PostModeratorv2 {
    public static void main(String[] args) {
        moderate("Post zawierający słowa wulgarne typu brzydkieslowo1 czy brzydkieslowo2");
        moderate("Post nie zawierający wulgaryzmów");
    }
    private static void moderate (String post){
String[] fWord = {"brzydkieslowo1", "brzydkieslowo2"};
String[] splitText= post.split(" ");




String resolt = "";
String tmpWord;
for (String postText : splitText) {
    tmpWord= postText;
    for (String blackList : fWord) {
        if (postText.equalsIgnoreCase(blackList)) {
            tmpWord="*****";
        }
    }
    resolt = resolt + tmpWord + " ";
}

System.out.println(resolt.trim());






    }
}
