import java.util.Scanner;

public class swapping{
   public static void main(String[] args) {
      
      // create a Scanner object to read input from the user
      Scanner sc = new Scanner(System.in);
      
      // prompt the user to enter the first number
      System.out.print("Enter the first number: ");
      int numA = sc.nextInt();
      
      // prompt the user to enter the second number
      System.out.print("Enter the second number: ");
      int numB = sc.nextInt();
      
      // print the values before swapping
      System.out.println("Before swapping:");
      System.out.println("numA = " + numA);
      System.out.println("numB = " + numB);
      
      // perform the swap using a temporary variable
      int temp = numA;
      numA = numB;
      numB = temp;
      
      // print the values after swapping
      System.out.println("After swapping:");
      System.out.println("numA = " + numA);
      System.out.println("numB = " + numB);
      
      // close the Scanner object
      sc.close();
   }
}