package SimpleProblems;

public class SumAndDigitDifference {
    public static int differenceOfSum(int[] nums) {
      int esum = 0,dsum = 0;
        for( int i:nums) {
            esum += i;
            while(i > 0){
              int cur = i%10;
              dsum += cur;
              i /= 10;
            }
        }
      return Math.abs(esum-dsum);
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int res = differenceOfSum(nums);
        System.out.println(res);
    }
}
