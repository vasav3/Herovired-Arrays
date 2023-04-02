public class MoveOnesToEnd {
    public static void main(String[] args) {
        int[] arrNum = {3, 1, 4, 1, 2, 1, 8, 3, 2, 1};
        int n = arrNum.length;
        int count = 0;
 
        // Count the number of non-ones elements
        for (int i = 0; i < n; i++) {
            if (arrNum[i] != 1) {
                arrNum[count++] = arrNum[i];
            }
        }
 
        // Move ones to the end of the array
        while (count < n) {
            arrNum[count++] = 1;
        }
 
        // Print the updated array
        System.out.print("Array elements after moving Ones to end: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arrNum[i] + " ");
        }
    }
}

