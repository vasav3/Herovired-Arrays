public class Substring{
    public static void main(String[] args) {
        String stringName = "Mangalyaan";
        int startIndex = 0;
        int endIndex = 5;

        String substring = stringName.substring(startIndex, endIndex+1);
        System.out.println("Substring of " + stringName + " from " + startIndex + " to " + endIndex + " is: " + substring);

        stringName = "Dinosaur";
        startIndex = 4;
        endIndex = 7;

        substring = stringName.substring(startIndex, endIndex+1);
        System.out.println("Substring of " + stringName + " from " + startIndex + " to " + endIndex + " is: " + substring);
    }
}

