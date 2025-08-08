package Searching;

public class ThirdOccurrence {
    public static void main(String[] args) {
        char key = 'a';
        int count = 0;
        String str = "Chandana";
        char[] arr = str.toCharArray();

        for(int i=0; i< arr.length;i++){
            if(arr[i] == key){
                count++;
                if(count==3){
                    arr[i] = '@';
                }
            }
        }
        String res = new String(arr);
        System.out.println(res);
    }
}
