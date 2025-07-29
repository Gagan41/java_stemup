package SimpleProblems;

public class SumOfNumbers {
    public static int addDigits(int num) {
      int count = 0, ref = num;
      while(ref>0){
          int cur = ref % 10;
          count += cur;
          ref /= 10;
      }
      if(count<10){
         return count;
      }
      return addDigits(count);
    }

    static int sumOf(int num){
        return 1+(num-1)%9;
    }

    public static void main(String[] args) {
        int num = 48;
        int res = addDigits(num);
        System.out.println(res);
        int res2 = sumOf(num);
        System.out.println(res2);
    }
}

//Used Digital root concept for more accuracy rather than recursion method