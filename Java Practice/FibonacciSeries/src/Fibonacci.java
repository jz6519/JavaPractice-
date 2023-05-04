
public class Fibonacci {

		private static long[] fibonacciMemory;
		public static void main (String[] args) {
			int n = 10;
			fibonacciMemory = new long[n + 1];
			for (int i = 0; i<= n; i++) {
				System.out.print(fibonacci(i) + " ");
			}
		}

		private static long fibonacci(int n) {
			if (n <= 1) {
				return n;
			}
		
		if (fibonacciMemory[n] != 0) {
			return fibonacciMemory[n];
		}
				
				
		long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2));
		fibonacciMemory[n] = nthFibonacciNumber;
			
		return nthFibonacciNumber;
		}
}
		
