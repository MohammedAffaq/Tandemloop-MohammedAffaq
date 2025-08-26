// Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
//   Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
//   Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        // Taking input from the users
        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.next();

        double result = calc.calculate(a, b, op);
        System.out.println("Result: " + result);

        sc.close();
    }
}

class Calculator {
    // Method for all the operations add,subtract, multiply, divide.
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
            case "+":
                return a + b;

            case "subtract":
            case "-":
                return a - b;

            case "multiply":
            case "*":
                return a * b;

            case "divide":
            case "/":
                if (b == 0) {
                    System.out.println("Error: Division by zero!");
                    return 0;
                }
                return a / b;

            default:
                System.out.println("Invalid operation!");
                return 0;
        }
    }
}
