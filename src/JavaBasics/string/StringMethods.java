package JavaBasics.string;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = sc.nextLine();//Hello Java

        //length of the string
        System.out.println("Length of the string is :"+str.length());

        //Character at a specific index
        System.out.println("Character at the index 2 is :"+str.charAt(2));

        //substring for a single index
        System.out.println("Substring from index 6 :"+str.substring(6));

        //substring from start to end index
        System.out.println("Substring from index 0 to 5 is : "+str.substring(0,5));

        //convert ot uppercase
        System.out.println("Given string in upper case is :"+str.toUpperCase());

        //convert to lowercase
        System.out.println("Given string in lower case is: "+str.toLowerCase());

        //trim leading and trailing spaces
        String str2 = "   Hello java   ";
        System.out.println("String after removing spaces is :`"+str2.trim()+"`");

        //replace characters
        System.out.println("replace a with @ in string :"+str.replace("a","@"));

        //check if the string contains a specific word
        //case sensitive
        System.out.println("does the string contain 'Java' :"+str.contains("Java"));

        //check if the string starts with the particular word
        //case sensitive
        System.out.println("Does the string starts with 'hel' :"+str.startsWith("hel"));

        //checks if the string ends with a particular word
        //case sensitive
        System.out.println("Does the string ends with 'va' :"+str.endsWith("va"));

        String s3 = "hello java";
        //index of first occurrence of a character
        //case sensitive (if the character is not in the string it will return -1)
        System.out.println("first occurrence of 'l' is :"+s3.indexOf('l'));

        //index of the last occurrence of given character
        //case sensitive (if the character is not in the string it will return -1)
        System.out.println("last occurrence of the character 'a' is :"+s3.lastIndexOf('a'));

        //checks equality to the other string
        //case sensitive
        System.out.println("Are the strings equal :"+s3.equals(str));

        //checks equality while ignoring case sensitivity
        System.out.println("Are the string equal while ignoring case :"+s3.equalsIgnoreCase(str));

        //checks if the string is empty or not
        System.out.println("IS the string empty:"+str.isEmpty());

        //splitting Strings
        System.out.println(str);
        System.out.println(str.getClass().getSimpleName());
        String[] parts = str.split(" ");
        System.out.println(parts.getClass().getSimpleName());
        System.out.println("Split parts :");
        for (String p:parts){
            System.out.println("- "+p);
        }

        //conversion to char Array
        char[] c = str.toCharArray();
        System.out.println(c.getClass().getSimpleName()); //to check the data type
        System.out.println("Characters :");
        for (char ch : c){
            System.out.println(ch);
        }

        //concat twp strings
        String s4 = str.concat(" Programming");
        System.out.println(s4);

        //compare two strings
        System.out.println("compare str to 'hello' :"+str.compareTo("hello"));

        //compare to Ignore case
        System.out.println("compare str while ignoring case :"+str.compareToIgnoreCase("Hello"));

        sc.close();
    }
}





















