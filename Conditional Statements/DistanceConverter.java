import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean doContinue = true;
        
        while (doContinue) {
            System.out.println("Menu based app - Unit conversion for Distance");
            System.out.println("1. CM to M");
            System.out.println("2. M to KM");
            System.out.println("3. KM to M");
            System.out.println("4. M to CM");
            System.out.print("Enter your menu - ");
            int menuChoice = sc.nextInt();
            
            switch (menuChoice) {
                case 1:
                    System.out.print("Please enter the CM value: ");
                    double cm = sc.nextDouble();
                    double meters = cm / 100.0;
                    System.out.println(cm + " CM = " + meters + " M");
                    break;
                case 2:
                    System.out.print("Please enter the M value: ");
                    double m = sc.nextDouble();
                    double km = m / 1000.0;
                    System.out.println(m + " M = " + km + " KM");
                    break;
                case 3:
                    System.out.print("Please enter the KM value: ");
                    double km2 = sc.nextDouble();
                    double m2 = km2 * 1000.0;
                    System.out.println(km2 + " KM = " + m2 + " M");
                    break;
                case 4:
                    System.out.print("Please enter the M value: ");
                    double m3 = sc.nextDouble();
                    double cm2 = m3 * 100.0;
                    System.out.println(m3 + " M = " + cm2 + " CM");
                    break;
                default:
                    System.out.println("Invalid menu choice. Please try again.");
                    break;
            }
            
            System.out.print("Do you want to Continue? (y/n): ");
            char continueChoice = sc.next().charAt(0);
            if (continueChoice == 'n' || continueChoice == 'N') {
                doContinue = false;
            }
        }
        
        sc.close();
    }
}
