package fizzBuzz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in;
		try {
			in = new Scanner(new BufferedReader(new FileReader(args[0])));
			while (in.hasNextLine()) {
				int xfactor = in.nextInt();
				int yfactor = in.nextInt();
				int max = in.nextInt() + 1;
				boolean[] x = new boolean[max];
				int i = 1;
				int current = i * xfactor;
				while (current < max) {
					x[current] = true;
					i++;
					current = i * xfactor;
				}
				i = 1;
				current = i * yfactor;
				boolean[] y = new boolean[max];
				while (current < max) {
					y[current] = true;
					i++;
					current = i * yfactor;
				}
				i = 1;
				while (true) {
					if (x[i]) {
						System.out.print("F");
						if (y[i])
							System.out.print("B");

					} else if (y[i]) {
						System.out.print("B");

					} else
						System.out.print(i);
					if (i == max - 1)
						break;
					else
						System.out.print(" ");
					i++;
				}
				System.out.println();
			}
		} catch (Exception e) {
		}
	}
}
