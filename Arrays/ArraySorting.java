import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
        
        int[] arrNum = {23, 21, 44, 32, 12};
        
        // Sorting array in ascending order
        Arrays.sort(arrNum);
        System.out.print("The elements in ascending order: ");
        for (int i = 0; i < arrNum.length; i++) {
            System.out.print(arrNum[i] + " ");
        }
        
        // Sorting array in descending order
        Arrays.sort(arrNum);
        System.out.print("\nThe elements in descending order: ");
        for (int i = arrNum.length - 1; i >= 0; i--) {
            System.out.print(arrNum[i] + " ");
        }
    }
}

