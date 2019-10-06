import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            int number = scanner.nextInt();
            numbers[i] = number;
        }
        for (int i = numbers.length -1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }
    }
}
