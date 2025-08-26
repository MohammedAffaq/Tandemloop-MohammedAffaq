# Tandemloop-MohammedAffaq
Programmming language : Java

## Problem-1: 
Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string
```
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
```
- Scanner sc = new Scanner(System.in); → Creates a Scanner object to take input from the user.
- Calculator calc = new Calculator(); → Creates an object of the Calculator class so we can use its   calculate method.
- Calls the calculate() method from Calculator class, passing a, b, and op.
- Stores the returned result in result.
- Prints the result on screen.

## Problem-2 :
With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
  Output: (examples)
    1) input a = 1, then output : 1
    2) input a = 2, then output : 1, 3
    3) input a = 3, then output : 1, 3, 5
    4) input a = 4, then output : 1, 3, 5, 7
    .
    .
    5) input a = x, then output : 1, 3, 5, 7, .......
```
    public class Problem2 {

      public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);

      // Take input from user
      System.out.print("Enter a number: ");
      int a = sc.nextInt();

      // Generate Series
      for(int i = 1; i<=a; i++) {
         System.out.print(2 * i - 1);
         if (i < a) {
            System.out.print(", ");
         }
      }
      sc.close();
   }
}
```
- Creates a Scanner object to read input from the user.
- Prompts the user to enter a number (a) and stores the input in an integer variable a.
- Formula *2 * i - 1* generates odd numbers.
- The if (i < a) ensures that a comma and space ", " is added only between numbers, not after the    last one.

## Problem-3 :
With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples] 
  Output: (examples)
    1) input a = 1, then output : 1
    2) input a = 2, then output : 1
    3) input a = 3, then output : 1, 3, 5
    4) input a = 4, then output : 1, 3, 5
    5) input a = 5, then output : 1, 3, 5, 7, 9
    6) input a = 6, then output : 1, 3, 5, 7, 9
    .
    .
    7) input a = x, then output : 1, 3, 5, 7, .......
```
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        // If input is even, reduce by 1
        if (a % 2 == 0) {
            a = a - 1;
        }

        // Generate series
        for (int i = 1; i <= a; i++) {
            System.out.print((2 * i - 1));
            if (i < a) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
```
- Creates a Scanner object to take input from the user.
- Prompts the user to enter an integer (a).
- Checks if a is even (a % 2 == 0), If yes, reduce it by 1.This ensures only odd numbers of terms    are printed.
- Formula *2 * i - 1* generates odd numbers.
- Prints numbers separated by commas.

## Problem-4 : 
Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
  (examples)
  input: [1,2,8,9,12,46,76,82,15,20,30]
  Output: 
    {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}

```
public class Problem4 {
    public static void main(String[] args) {
        // Fixed input array
        int[] numbers = { 1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30 };

        // Array to store counts (index 1..9)
        int[] count = new int[10];

        // Count multiples
        for (int i = 1; i <= 9; i++) {
            for (int num : numbers) {
                if (num % i == 0) {
                    count[i]++;
                }
            }
        }

        // Print result in dictionary-like format
        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + count[i]);
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
```
- Creates an integer array of size 10.
- Indexes 1–9 will be used to store counts.
  - count[1] → how many numbers are divisible by 1
  - count[2] → how many numbers are divisible by 2
- Running 2 loops :
    - Outer loop → goes from i = 1 to 9.
    - Inner loop → goes through every number in numbers.
- if (num % i == 0) checks if num is divisible by i. If yes, increase the counter count[i].
- Starts printing "{" like a dictionary.Prints each key (1–9) with its count. Adds , between         entries and ends with "}".
