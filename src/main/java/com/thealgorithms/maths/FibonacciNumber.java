import java.math.BigInteger;

public final class FibonacciNumber {
    private FibonacciNumber() {
    }

    // Compute the limit for n that fits in a long
    private static final int argLimit = 100;

    public static BigInteger nthFibonacci(int n) {
        if (n > argLimit) {
            throw new IllegalArgumentException("Input 'n' is too large to fit into a long.");
        }

        // Calculate the nth Fibonacci number using the golden ratio formula
        final double sqrt5 = Math.sqrt(5);
        final double phi = (1 + sqrt5) / 2;
        final double psi = (1 - sqrt5) / 2;
        double result = (Math.pow(phi, n) - Math.pow(psi, n)) / sqrt5;

        // Round to the nearest integer and convert to BigInteger
        return BigInteger.valueOf(Math.round(result));
    }
}
