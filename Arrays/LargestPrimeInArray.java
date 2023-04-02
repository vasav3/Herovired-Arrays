public class LargestPrimeInArray {
    public static void main(String[] args) {
        int[] arrNum = {2, 29, 51, 8, 4};
        int maxPrime = -1;
        
        for(int num : arrNum) {
            if(isPrime(num) && num > maxPrime) {
                maxPrime = num;
            }
        }
        
        if(maxPrime == -1) {
            System.out.println("There are no prime numbers in the array.");
        } else {
            System.out.println("The largest prime number in the given array is: " + maxPrime);
        }
    }
    
    public static boolean isPrime(int num) {
        if(num < 2) {
            return false;
        }
        
        for(int i=2; i*i<=num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}

