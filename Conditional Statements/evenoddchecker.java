import java.util.Scanner;

public class evenoddchecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = 'y';
        while(choice == 'y') {
            System.out.println("\nMenu based app - Even/Odd Checker\n");
            System.out.print("Please enter the number: ");
            int num = sc.nextInt();
            if(num % 2 == 0) {
                System.out.println("The given number - " + num + " is an EVEN Number");
            } else {
                System.out.println("The given number - " + num + " is a ODD Number");
            }
            System.out.print("\nDo you want to Continue: ");
            choice = sc.next().charAt(0);
        }
        sc.close();
    }

}
