package bitPositions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		String line;
		int size = 0;
		Scanner in = null;
		while ((line = br.readLine()) != null) {
			in = new Scanner(line);
			in.useDelimiter(",");
			line = Integer.toBinaryString(in.nextInt());
			size = line.length();
			System.out.println(line.charAt((size - in.nextInt())) == line
					.charAt(size - in.nextInt()));
		}
	}
}