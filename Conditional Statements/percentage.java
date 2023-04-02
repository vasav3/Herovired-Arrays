import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total marks: ");
        double totalMarks = scanner.nextDouble();

        System.out.print("Enter marks obtained: ");
        double marksObtained = scanner.nextDouble();

        double percentage = (marksObtained / totalMarks) * 100;
        System.out.printf("Percentage: %.2f%%\n", percentage);

        double gpa;
        if (percentage >= 90) {
            System.out.println("Grade A");
            gpa = 4.0;
        } else if (percentage >= 80) {
            System.out.println("Grade B");
            gpa = 3.0;
        } else if (percentage >= 70) {
            System.out.println("Grade C");
            gpa = 2.0;
        } else if (percentage >= 60) {
            System.out.println("Grade D");
            gpa = 1.0;
        } else {
            System.out.println("Grade F");
            gpa = 0.0;
        }

        System.out.printf("GPA: %.1f", gpa);
    }
}
