package fibonacciSeries;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new BufferedReader(new FileReader(args[0])));
		double sfive = Math.sqrt(5.0);
		while (in.hasNext()) {
			System.out.println((int) (0.45 + Math.pow(((1.0 + sfive) / 2.0),
					in.nextDouble())
					/ sfive));
		}
	}
}