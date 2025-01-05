public class OddEven {
    /*
     * To identify a number is odd or even without using modulo operator or division operator or multiplication operator -
     * we can use bitwise AND operator.
     *
     * Performing bitwise AND operation between the number and 1 will give us the result.
     *
     * 1 in binary is 000...0001 (a single 1 at the least significant bit, LSB).
     * Performing a bitwise AND with 1 isolates the last bit of i.
     * If the result is 1, then the number is odd.
     * If the result is 0, then the number is even.
     */
    public static void main(String[] args) {
        int[] numbers = {-5, 0, 1, 13, 20};
        for (int number : numbers) {
            System.out.println(number + " is " + isEvenOrOdd(number));
        }
    }

    private static String isEvenOrOdd(int number) {
        return (number & 1) == 0 ? "Even" : "Odd";
    }
  
}
