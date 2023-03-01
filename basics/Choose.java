package basics;

import java.util.Scanner;

public class Choose {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();
            System.out.println(
                    "Enter the operation (1 for addition, 2 for subtraction, 3 for multiplication, 4 for division): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The sum of the two numbers is: " + addition(num1, num2));
                    break;
                case 2:
                    System.out.println("The Subtraction of the two numbers is: " + subtraction(num1, num2));
                    break;
                case 3:
                    System.out.println("The Multiplication of the two numbers is: " + multiplication(num1, num2));
                    break;
                case 4:
                    System.out.println("The quotient of the two numbers is: " + division(num1, num2));
                    break;
                default:
                    System.out.println("Invalid Operation");
            }
        }
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }
}
