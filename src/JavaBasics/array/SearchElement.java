package JavaBasics.array;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int key = 3;
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            if(key==arr[i]){
                System.out.println("element found at index: "+ i);
              found = true;
              break;
            }
        }
        System.out.println("Is the element found? "+found);
    }
}
