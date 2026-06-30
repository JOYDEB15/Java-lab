import java.util.Scanner;

public class EvenNumbersArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        if (start > end) {
            System.out.println("Invalid range! Starting number should be less than or equal to ending number.");
            return;
        }

        int maxSize = (end - start) / 2 + 1;
        int[] evenNumbers = new int[maxSize];
        int count = 0;

        int current = start;
        while (current <= end) {
            if (current % 2 == 0) {
                evenNumbers[count] = current;
                count++;
            }
            current++;
        }

        System.out.println("\nEven numbers in the given range are:");
        if (count == 0) {
            System.out.println("No even numbers found in this range.");
        } else {
            int i = 0;
            do {
                System.out.print(evenNumbers[i] + " ");
                i++;
            } while (i < count);
            System.out.println();
        }

        scanner.close();
    }
}

