package Searching;

public class Characterindex {
    public static void main(String[] args) {
        String str = "Chandana";
            if(str.contains("a")){
                System.out.println("index of first occurrence is:"+str.indexOf('a'));
                str =str.replaceFirst("a", "@"); ;
            }
            else {
                System.out.println("Doesn't contain the character");
            }
        System.out.println(str);
    }
}
