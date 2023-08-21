import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Enter an operation (+, -, *, /) or 'q' to quit:");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("q")) {
                running = false;
                continue;
            }

            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();

            double result;

            switch (operation) {
                case "+":
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case "-":
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case "*":
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case "/":
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid operation!");
            }

            scanner.nextLine(); // Consume the newline character
            System.out.println();
        }

        System.out.println("Calculator has been closed.");
        scanner.close();
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return num1 / num2;
    }
}