
package missingnumberchallenge;

import java.util.*;

public class MissingNumberChallenge {
    
    public static List<Integer> findMissingNumbers(int[] numbers) {
        Set<Integer> numberSet = new HashSet<>();
        List<Integer> missingNumbers = new ArrayList<>();

        for (int number : numbers) {
            numberSet.add(number);
        }

        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        for (int i = min; i <= max; i++) {
            if (!numberSet.contains(i)) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers separated by spaces: ");
        String input = scanner.nextLine();

        String[] inputNumbers = input.split(" ");
        int[] numbers = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        List<Integer> missingNumbers = findMissingNumbers(numbers);
        System.out.println("Missing Numbers: " + missingNumbers);
    }
}
