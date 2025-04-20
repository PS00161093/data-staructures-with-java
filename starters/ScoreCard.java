import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int newNumber = 11;
        int[] numbersForLeft = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        int[] numbersForRight = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        shiftLeftVersion(numbersForLeft, newNumber);
        shiftRightVersion(numbersForRight, newNumber);
    }

    private static void shiftLeftVersion(int[] numbers, int newNumber) {
        int len = numbers.length;
        int i = len - 1;
        if (numbers[i] >= newNumber) {
            System.out.println("Come bigger");
            return;
        }

        while (i >= 0 && numbers[i] < newNumber) {
            if (i == 0) {
                numbers[i] = newNumber;
            } else {
                numbers[i] = numbers[i - 1];
            }
            i--;
        }
        numbers[i + 1] = newNumber;
        System.out.println(Arrays.toString(numbers));
    }

    private static void shiftRightVersion(int[] numbers, int newNumber) {
        int len = numbers.length;

        // Don't add if new number is smaller than all existing numbers
        if (newNumber <= numbers[len - 1]) {
            System.out.println("Come bigger");
            return;
        }

        // In-place insertion (descending order)
        int i = len - 2;
        while (i >= 0 && numbers[i] < newNumber) {
            numbers[i + 1] = numbers[i]; // shift right
            i--;
        }
        numbers[i + 1] = newNumber;

        System.out.println(Arrays.toString(numbers));
    }
    
}
