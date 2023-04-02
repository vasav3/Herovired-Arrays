import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        // Finding the smallest number
        int smallest = num1;
        if(num2 < smallest) {
            smallest = num2;
        }
        if(num3 < smallest) {
            smallest = num3;
        }

        // Finding the largest number
        int largest = num1;
        if(num2 > largest) {
            largest = num2;
        }
        if(num3 > largest) {
            largest = num3;
        }

        // Finding the average of all three numbers
        double average = (double)(num1 + num2 + num3) / 3;

        // Displaying the results
        System.out.println("The Smallest Number: " + smallest);
        System.out.println("The Largest Number: " + largest);
        System.out.println("Average of all three numbers: " + average);
    }
}

