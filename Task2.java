import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // If Else 
        System.out.println(" Basic Arithmetic using if else");
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (operator == '/') {
            if (num2 != 0)
                System.out.println("Result: " + (num1 / num2));
            else
                System.out.println("Error: Division by zero");
        } else {
            System.out.println("Invalid operator!");
        }

        //  Menu-driven calculator using switch
        System.out.println("\n Menu-Driven Calculator using switch");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.print("Choose an option (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sum: " + (a + b));
                break;
            case 2:
                System.out.println("Difference: " + (a - b));
                break;
            case 3:
                System.out.println("Product: " + (a * b));
                break;
            case 4:
                if (b != 0)
                    System.out.println("Quotient: " + (a / b));
                else
                    System.out.println("Error: Division by zero");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        // 3️ for loop: Multiplication Table
        System.out.println("\n Multiplication Table using for loop");
        System.out.print("Enter a number: ");
        int tableNum = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
        }

        // 4️ while loop: Repeat input until user enters 0
        System.out.println("\n Enter numbers (0 to stop):");
        int input;
        while (true) {
            System.out.print("Enter a number: ");
            input = sc.nextInt();
            if (input == 0) {
                System.out.println("Exiting loop...");
                break;
            }
            System.out.println("You entered: " + input);
        }

        sc.close();
    }
}