package JavaBasics.Array2D;

public class LargestElementInRow {
     public static void largestEler(int [][] arr){
         int n = arr.length, m = arr[0].length;
         for(int i=0; i<n; i++){
             int maxEle = arr[i][0];
             for( int j=1; j<m; j++){
                 if(arr[i][j]>=maxEle){
                     maxEle = arr[i][j];
                 }
             }
             System.out.println("Max element in the row "+i+" is:"+maxEle);
         }
     }

    public static void mintEler(int [][] arr){
        int n = arr.length, m = arr[0].length;
        for(int i=0; i<n; i++){
            int minEle = arr[i][0];
            for( int j=1; j<m; j++){
                if(arr[i][j]<=minEle){
                    minEle = arr[i][j];
                }
            }
            System.out.println("Min element in the row "+i+" is:"+minEle);
        }
    }

    public static void maxElec(int [][] arr){
        int n = arr.length, m = arr[0].length;
        for(int j=0; j<m; j++){
            int maxEle = arr[0][j];
            for( int i=1; i<n; i++){
                if(arr[i][j]>=maxEle){
                    maxEle = arr[i][j];
                }
            }
            System.out.println("Max element in the column "+j+" is:"+maxEle);
        }
    }

    public static void minElec(int [][] arr){
        int n = arr.length, m = arr[0].length;
        for(int j=0; j<m; j++){
            int minEle = arr[0][j];
            for( int i=1; i<n; i++){
                if(arr[i][j]<=minEle){
                    minEle = arr[i][j];
                }
            }
            System.out.println("Min element in the column "+j+" is:"+minEle);
        }
    }

    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        largestEler(arr);
        mintEler(arr);
        maxElec(arr);
        minElec(arr);
    }
}
