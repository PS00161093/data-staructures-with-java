package exercise;

/*
    Write a short Java method that takes an integer n and
    returns the sum of all the odd positive integers less than or equal to n.
 */
public class OddSum {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum is " + sumOfOddNumbers(n));
    }

    private static int sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum += i;
        }

        return sum;
    }
}

