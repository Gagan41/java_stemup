package SimpleProblems;

public class DigitDivider {
    public static int countDigits(int num) {
        int count = 0,ref = num;
        while(ref>0){
         int cur = ref%10;
         if(num%cur == 0 ){
             count++;
         }
         ref /= 10;
      }
        return count;
    }

    public static void main(String[] args) {
        int num = 1248;
        int res = countDigits(num);
        System.out.println(res);
    }
}
