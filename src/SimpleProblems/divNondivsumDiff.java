package SimpleProblems;

public class divNondivsumDiff {
    public static int differenceOfSums(int n, int m) {
      int num1=0,num2=0,i=0;
      while( i<=n) {
          if (i % m != 0) {
              num1 += i ;
          }

          if (i % m == 0) {
              num2 += i;
          }

          i++;
      }
        return num1-num2;
    }

    public static int diff(int n, int m){
        int tot = n*(n+1)/2;
        int k = n/m;
        int div = m*k*(k+1)/2;
        int ndiv = tot - div;
        return ndiv-div;
    }

    public static void main(String[] args) {
        int n=10,m=3;
        int res = differenceOfSums(n,m);
        System.out.println(res);
        int res2 = diff(n,m);
        System.out.println(res2);
    }
}

// Total sum from 1 to n:
// TotalSum = n * (n + 1) / 2
// This is the sum of all natural numbers from 1 to n using the arithmetic progression formula.

// Sum of numbers divisible by m:
// Count of terms divisible by m: k = n / m
// These divisible numbers are: m, 2m, 3m, ..., km
// This forms an AP (Arithmetic Progression) with:
// - First term = m
// - Last term = k * m
// - Number of terms = k
// Sum of this AP = m * k * (k + 1) / 2

// Sum of non-divisible numbers:
// NonDivisibleSum = TotalSum - DivisibleSum
// (i.e., subtracting the divisible numbers from the total gives the sum of non-divisible numbers)

// Final Answer:
// Difference = NonDivisibleSum - DivisibleSum
// This is the required difference between the sum of numbers not divisible by m and those divisible by m.
