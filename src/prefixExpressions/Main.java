package prefixExpressions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
	public static Scanner in;

	public static void main(String[] args) throws Exception {
		Scanner line = new Scanner(new BufferedReader(new FileReader(args[0])));
		while (line.hasNextLine()) {
			in = new Scanner(line.nextLine());
			System.out.println((int) calculate(in.next()));
		}
		in.close();
		line.close();
	}

	public static double calculate(String sym) {
		switch (sym) {
		case "/":
			return calculate(in.next()) / calculate(in.next());
		case "+":
			return calculate(in.next()) + calculate(in.next());
		case "*":
			return calculate(in.next()) * calculate(in.next());
		default:
			return (double) Integer.parseInt(sym);
		}
	}

}
