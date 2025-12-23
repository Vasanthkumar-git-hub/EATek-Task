import java.util.Scanner;

public class SimpleApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents;

        System.out.print("Enter number of students: ");
        numberOfStudents = input.nextInt();

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("\nStudent " + i + ":");

            System.out.print("Enter name: ");
            String name = input.next();

            System.out.print("Enter marks in Tamil: ");
            int tamil = input.nextInt();

            System.out.print("Enter marks in English: ");
            int english = input.nextInt();

            System.out.print("Enter marks in Maths: ");
            int maths = input.nextInt();

            int total = tamil + english + maths;
            double average = total / 3.0;
            System.out.println("=============== Student Result Details ===============");
            System.out.println("Student Name : " + name);
            System.out.println("Total Marks: " + total);
            System.out.printf("Average: %.2f\n" , average);

            if (average >= 50) {
                System.out.println("Result: Pass");
            } else {
                System.out.println("Result: Fail");
            }
        }

        input.close();
    }
}