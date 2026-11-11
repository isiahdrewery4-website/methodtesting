import java.util.Scanner;

public class MethodTesting {

    public static boolean isDouble(double value) {
        return true;
    }

    public static boolean compareNumbers(double num1, double num2, double num3) {
        return Math.floor(num1 * num2) == Math.floor(num3);
    }

    public static double findSmallest(Scanner input) {

        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
        }

        double smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double value = input.nextDouble();

        System.out.println("Is the value a double? "
                + isDouble(value));

        System.out.print("\nEnter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        System.out.println("Do the floor values match? "
                + compareNumbers(num1, num2, num3));

        System.out.println("\nEnter 10 numbers:");

        double smallest = findSmallest(input);

        System.out.println("The smallest number is: " + smallest);

        input.close();
    }
}
