package src;
public class PostModerator {
    public static void main(String[] args) {
        moderate("Post zawierający słowa wulgarne typu brzydkieslowo1 czy brzydkieslowo2");
        moderate("Post nie zawierający wulgaryzmów");
    }
    private static void moderate (String post){
String[] fWord = {"brzydkieslowo1", "brzydkieslowo2"};
String[] splitText= post.split(" ");


for (String postText : splitText) {
 
    for (String blackList : fWord) {
        if (postText.equalsIgnoreCase(blackList)) {
            System.out.println("Post niezgodny");
           return;
        }
    }
    
}
System.out.println("Post zaakceptowany");


    }
}
