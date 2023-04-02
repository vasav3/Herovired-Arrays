import java.util.*;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] arrSuperSet = {3, 1, 3, 4, 1, 2, 1, 8, 3, 2, 1, 1, 3, 2, 3, 3, 4};
        int[] arrSubSet = {1, 2, 3, 5, 9};
        
        Map<Integer, Integer> frequency = new HashMap<>();
        
        for(int i=0; i<arrSuperSet.length; i++) {
            if(Arrays.asList(arrSubSet).contains(arrSuperSet[i])) {
                frequency.put(arrSuperSet[i], frequency.getOrDefault(arrSuperSet[i], 0) + 1);
            }
        }
        
        for(int i=0; i<arrSubSet.length; i++) {
            if(!frequency.containsKey(arrSubSet[i])) {
                frequency.put(arrSubSet[i], 0);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            System.out.println("Frequency of " + entry.getKey() + ": " + entry.getValue());
        }
    }
}

