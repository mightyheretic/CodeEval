package sumofPrimes;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int sumofPrimes = 5;
		final int numofPrimes = 1000;
		ArrayList<Integer> primes = new ArrayList<Integer>(numofPrimes);
		primes.add(2);
		primes.add(3);
		for (int i = 5; primes.size() < numofPrimes; i += 2) {
			boolean prime = true;
			for (Integer e : primes) {
				if ((i / e) * e == i) {
					prime = false;
					break;
				}
			}
			if (prime) {
				sumofPrimes += i;
				primes.add(i);
			}
		}
		System.out.println(sumofPrimes);
	}

}
