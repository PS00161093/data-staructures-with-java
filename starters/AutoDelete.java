import java.util.Random;

/**
 * Write a Java method that repeatedly selects 
 * and removes a random entry from an array 
 * until the array holds no more entries.
 */
public class AutoDelete {

    public static void main(String[] args) {
        int[] numbers = {-5, 0, 1, 13, 20};
        removeRandomEntries(numbers);
    }

    public static void removeRandomEntries(int[] numbers) {
        Random random = new Random();
        int totalNumbers = numbers.length;

        while (totalNumbers > 0) {
            int index = random.nextInt(totalNumbers);
            System.out.println("Removed: " + numbers[index]);
            for (int i = index; i < totalNumbers - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            totalNumbers--;
        }
    }
}
