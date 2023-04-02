import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        boolean isPrime = true;
        
        if (num <= 1) {
            isPrime = false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println("The given number " + num + " is a Prime number");
        } else {
            System.out.println("The given number " + num + " is NOT a Prime number");
        }
    }
}
