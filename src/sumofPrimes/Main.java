package sumofPrimes;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int sumofPrimes = 5;
		ArrayList<Integer> primes = new ArrayList<Integer>(1000);
		primes.add(2);
		primes.add(3);
		for (int i = 4; primes.size() < 1000; i++) {
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
