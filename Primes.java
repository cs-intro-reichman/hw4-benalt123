public class Primes {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        if (n < 2) {
            System.out.println("There are no prime numbers less than 2.");
            return;
        }
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        //sieve of eratosthenes
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int Count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                Count++;
            }
        }

        double percentage = (double) Count / (n - 1) * 100;
        System.out.println("\nThere are " + Count + " primes between 2 and " + n + 
                           " (" + String.format("%.0f", percentage) + "% are primes)");
    }
}