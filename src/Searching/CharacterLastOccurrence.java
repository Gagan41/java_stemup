package Searching;

public class CharacterLastOccurrence {
    public static void main(String[] args) {
        String str = "Chandana";
        String news = "";
        char key = 'a';

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == key) {
                System.out.println("Index is: " + i);
                news = str.substring(0, i) + '@' + str.substring(i + 1);
                break;
            }
        }
        if (news.isEmpty()) {
            news = str;
        }

        System.out.println(news);
    }
}
